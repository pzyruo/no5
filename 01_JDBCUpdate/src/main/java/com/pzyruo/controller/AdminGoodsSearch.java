package com.pzyruo.controller;

import com.pzyruo.domain.Goods;
import com.pzyruo.service.GoodsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/goods/search.do")
public class AdminGoodsSearch extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //2.调用业务
        GoodsService goodsService = new GoodsService();
        final List<Goods> goodsList = goodsService.findAll();
        System.out.println(goodsList);
        //3.页面导航，数据传递,使用request。必须使用请求转发
        request.setAttribute("goodsList",goodsList);
        request.getRequestDispatcher("/admin/goods/show.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doPost(request,response);

    }
}
