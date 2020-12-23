package com.pzyruo.controller;

import com.pzyruo.domain.Items;
import com.pzyruo.service.ItemService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cart/cart.do")
public class ItemSearchController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.
        //2
        ItemService itemService = new ItemService();
        Items items = itemService.selectAll();
        System.out.println(items);
        request.setAttribute("items",items);
        request.getRequestDispatcher(request.getContextPath()+"/cart/Cart.jsp").forward(request,response);

    }
}
