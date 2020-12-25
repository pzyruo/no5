package com.pzyruo.controller;

import com.pzyruo.domain.Orders;
import com.pzyruo.service.OrderService;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/order/topay.do")
public class OrderToPayController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1
		String orderId = request.getParameter("orderId");
		//2
		OrderService orderService = new OrderService();
		Orders order = orderService.findById(orderId);
		System.out.println("去支付"+order);
		//3
		request.setAttribute("order", order);
		request.getRequestDispatcher("/order/pay.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}
}
