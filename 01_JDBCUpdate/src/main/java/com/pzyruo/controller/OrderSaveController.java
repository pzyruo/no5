package com.pzyruo.controller;

import com.pzyruo.domain.*;
import com.pzyruo.service.ItemService;
import com.pzyruo.service.OrderService;
import com.pzyruo.util.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/order/save.do")
public class OrderSaveController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/// 1
		//获取数据
		String recName = request.getParameter("recName");
		String recAdd = request.getParameter("recAdd");
		String recPhone = request.getParameter("recPhone");
		Users user = (Users) request.getSession().getAttribute("user");
		List<Items> itemList = new ItemService().findByUser(user);//购物车
		//封装订单对象
		Orders order = new Orders();
		String orderId = FileUtil.ReFileName();
		order.setOrderId(orderId);
		order.setOrderAddress(recAdd);
		order.setOrderConsignee(recName);
		order.setOrderPhone(recPhone);
		order.setOrderUser(user);
		order.setOrderTime(new Date());
		Status status = new Status();//初始状态，待支付状态
		status.setStatusId(2);
		order.setOrderStatus(status);
		double orderPrice = 0;
		//组织订单中的明细集合，迭代用户的购物车，购物车中每一项就是一个订单明细
		List<Details> detailList = new ArrayList<Details>();
		for (Items item : itemList) {
			Details detail = new Details();
			detail.setDetailGoods(item.getItemGoods());
			detail.setDetailOrder(order);
			detail.setDetailGoodsNum(item.getItemGoodsNum());
			detail.setDetailGoodsPrice(item.getItemGoods().getGoodsPrice());
			detailList.add(detail);
			orderPrice += item.getItemGoodsNum()*item.getItemGoods().getGoodsPrice();
			if(item.getItemGoods().getGoodsNum() < item.getItemGoodsNum() ){
				request.setAttribute("errorInfo", "库存数量不足！保存订单失败！");
				request.getRequestDispatcher("/cart/cart.do").forward(request, response);
				return;
			}
		}
		order.setDetailList(detailList);
		order.setOrderPrice(orderPrice);
		// 2
		OrderService orderService = new OrderService();
		orderService.saveOrder(order);
		// 3
		response.sendRedirect(request.getContextPath()+"/order/topay.do?orderId="+orderId);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
