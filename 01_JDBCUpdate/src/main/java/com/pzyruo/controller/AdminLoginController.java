package com.pzyruo.controller;

import com.pzyruo.domain.Admins;
import com.pzyruo.domain.Funs;
import com.pzyruo.service.AdminService;
import com.pzyruo.service.FunService;
import com.pzyruo.util.MD5Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/adminLogin.do")
public class AdminLoginController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1
        String adminName = request.getParameter("adminName");
        String adminPass = request.getParameter("adminPass");
        // 2
        AdminService adminsService = new AdminService();
        Admins admin = adminsService.findByName(adminName);
        System.out.println("123"+admin);
        if(admin==null){
            response.sendRedirect(request.getContextPath()+"/adminlogin.jsp");
        }else{
            if(admin.getAdminPass().equals(  MD5Util.getMd5(adminPass)  )){
                FunService funsService = new FunService();
                List<Funs> funList = funsService.findByRole(admin.getAdminRole().getRoleId());
                admin.getAdminRole().setFunList(funList);

                HttpSession session = request.getSession();
                session.setAttribute("admin", admin);
                System.out.println("45*6"+admin);
                response.sendRedirect(request.getContextPath()+"/admin/main.jsp");
            }else{
                response.sendRedirect(request.getContextPath()+"/adminlogin.jsp");
            }
        }
    }



}

