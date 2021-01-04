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

@WebServlet("/goods/search.do")
public class GoodsSearch extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //1获取条件
        SearchVO searchVO = new SearchVO();
        if (request.getParameter("goodsName")!=null && !"".equals(request.getParameter("goodsName"))){
            searchVO.setGoodsName(request.getParameter("goodsName"));
        }
        if(request.getParameter("minGoodsPrice")!=null && !"".equals(request.getParameter("minGoodsPrice"))){
            searchVO.setMinGoodsPrice(Double.parseDouble(request.getParameter("minGoodsPrice")));
        }
        if(request.getParameter("maxGoodsPrice")!=null && !"".equals(request.getParameter("maxGoodsPrice"))){
            searchVO.setMaxGoodsPrice(Double.parseDouble(request.getParameter("maxGoodsPrice")));
        }
        if(request.getParameter("typeId")!=null && !"-1".equals(request.getParameter("typeId"))){
            searchVO.setTypeId(Integer.parseInt(request.getParameter("typeId")));
        }

        //2获取分页
        int page = 1;
        if (request.getParameter("page")!=null){
            page = Integer.parseInt(request.getParameter("page"));
        }
        int recordOfPage = 2;
        //3.调用业务
        GoodsService goodsService = new GoodsService();
        PageVO<Goods> pageVO = goodsService.search(searchVO,page,recordOfPage);
        //4.页面导航
        request.setAttribute("pageVO",pageVO);
        request.setAttribute("goodsList",pageVO.getList());
        request.getRequestDispatcher("/goods/search.jsp").forward(request,response);
    }
}
