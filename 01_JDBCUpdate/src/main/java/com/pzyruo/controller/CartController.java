package com.pzyruo.controller;

import com.pzyruo.domain.Items;
import com.pzyruo.domain.Users;
import com.pzyruo.service.ItemService;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cart/cart.do")
public class CartController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Users user = (Users) request.getSession().getAttribute("user");
		ItemService itemService = new ItemService();
		List<Items> itemList = itemService.findByUser(user);
		request.setAttribute("itemList", itemList);
		request.getRequestDispatcher("/cart/cart3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		    doGet(request, response);
	}
}
