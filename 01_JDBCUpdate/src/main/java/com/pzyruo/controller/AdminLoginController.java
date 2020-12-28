package com.pzyruo.controller;

import com.pzyruo.domain.Admins;
import com.pzyruo.domain.Funs;
import com.pzyruo.domain.Roles;
import com.pzyruo.exception.NameException;
import com.pzyruo.exception.PassWordException;
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1
        String adminName = request.getParameter("adminName");
        String adminPass = request.getParameter("adminPass");
        // 2
        AdminService adminsService = new AdminService();
        FunService funService = new FunService();


        try {
            Admins admin = adminsService.isLogin(adminName,adminPass);
            Roles role = admin.getAdminRole();
            //获取权限
            role.setFunList(funService.findByRole(role.getRoleId()));
            request.getSession().setAttribute("admin",admin);
            response.sendRedirect(request.getContextPath()+"/admin/main.jsp");
        } catch (NameException e) {
            e.printStackTrace();
        } catch (PassWordException e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath()+"/adminlogin.jsp");
        }

    }



}

