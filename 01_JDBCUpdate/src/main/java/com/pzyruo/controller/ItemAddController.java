package com.pzyruo.controller;

import com.pzyruo.domain.Goods;
import com.pzyruo.domain.Users;
import com.pzyruo.service.ItemService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cart/itemAdd.do")
public class ItemAddController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//1.接受参数
        int goodsId = Integer.parseInt(request.getParameter("goodsId"));
        int goodsNum = 1;
        if (request.getParameter("goodsNum")!=null){
            goodsNum = Integer.parseInt(request.getParameter("goodsNum"));
        }
        //2调用Service
        Goods goods = new Goods();
        goods.setGoodsId(goodsId);
        Users user = (Users) request.getSession().getAttribute("user");
        ItemService itemService = new ItemService();
        itemService.add(user,goods,goodsNum);
        //3
        response.sendRedirect(request.getContextPath()+"/cart/cart.do");
    }
}
