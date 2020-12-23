package com.pzyruo.controller;

import com.pzyruo.domain.Goods;
import com.pzyruo.service.GoodsService;
import com.pzyruo.vo.PageVO;
import com.pzyruo.vo.SearchVO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/goods/list.do")
public class GoodsListController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SearchVO searchVO = new SearchVO();

        GoodsService service = new GoodsService();
        PageVO<Goods> pageVO = service.search(searchVO,1,4);
        request.setAttribute("pageVO",pageVO);
        request.getRequestDispatcher("/goods/list.jsp").forward(request,response);



    }
}
