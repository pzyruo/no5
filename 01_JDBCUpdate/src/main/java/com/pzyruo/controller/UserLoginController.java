package com.pzyruo.controller;

import com.pzyruo.domain.Users;
import com.pzyruo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userLogin.do")
public class UserLoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService service = new UserService();
        Users user = service.findUser();
        request.getSession().setAttribute("user", user);
        response.sendRedirect(request.getContextPath() + "/goods/list.do");
    }
}
