package com.pzyruo.controller;

import com.pzyruo.domain.Types;
import com.pzyruo.service.TypesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin/types/search.do")
public class AdminTypesSearch extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        this.doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入商品类型查询");
        TypesService typesService = new TypesService();
        List<Types> typesList = typesService.findAll();
        request.setAttribute("typesList",typesList);
        request.getRequestDispatcher("/admin/type/show.jsp").forward(request,response);




    }
}
