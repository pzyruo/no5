package com.pzyruo.controller;

import com.pzyruo.domain.Items;
import com.pzyruo.domain.Recipients;
import com.pzyruo.domain.Users;
import com.pzyruo.service.ItemService;
import com.pzyruo.service.RecService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/order/confirm.do")
public class ConfirmOrder extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.
        Users users = (Users) request.getSession().getAttribute("user");
        //2.  查询收货人地址信息
        RecService orderService  = new RecService();
        List<Recipients> recList =orderService.findByUser(users);
        //查询购物车商品信息
        ItemService itemService = new ItemService();
        List<Items> itemsList = itemService.findByUser(users);
        request.setAttribute("itemsList", itemsList);
        System.out.println(itemsList);
        System.out.println("这是Controller的list"+recList);
        //3 在请求域中设置地址对象
        request.setAttribute("recList",recList);
        //在请求域中设置商品对象
        request.getRequestDispatcher("/order/confirmOrder.jsp").forward(request,response);
    }
}
