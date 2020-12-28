package com.pzyruo.controller;

import com.pzyruo.domain.Types;
import com.pzyruo.service.TypesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/types/oneSave.do")
public class AdminSubTypeSave extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String typeName = request.getParameter("typeName");
        final int pid = Integer.parseInt(request.getParameter("pid"));
        Types types = new Types();
        types.setTypeName(typeName);
        //2
        TypesService service = new TypesService();
        service.saveType(types,pid);
        response.sendRedirect(request.getContextPath()+"/admin/types/searchByID.do?typeId="+pid);
    }
}
