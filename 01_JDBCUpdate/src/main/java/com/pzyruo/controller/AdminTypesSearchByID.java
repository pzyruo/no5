package com.pzyruo.controller;

import com.pzyruo.domain.Types;
import com.pzyruo.service.TypesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/types/searchByID.do")
public class AdminTypesSearchByID extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final int id = Integer.parseInt(request.getParameter("typeId"));
        TypesService service = new TypesService();
        Types type = service.findById(id);
        System.out.println("进入擦黑奥");
        System.out.println(type);
        request.setAttribute("type",type);
        request.getRequestDispatcher("/admin/type/showtype.jsp").forward(request,response);


    }
}
