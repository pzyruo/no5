package com.pzyruo.controller;

import com.pzyruo.domain.Users;
import com.pzyruo.exception.NameException;
import com.pzyruo.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

@WebServlet("/userLogin.do")
public class UserLoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.
        String userPhone = request.getParameter("userPhone");
        String userPass = request.getParameter("userPass");
        int userCode= Integer.parseInt(request.getParameter("userCode"));
        int serveCode = (int) request.getSession().getAttribute("code");
        if (userCode!=serveCode){
            response.sendRedirect(request.getContextPath()+"/login.jsp");
        }
        //2
        UserService userService = new UserService();
        try {
            Users user = userService.findUser(userPhone, userPass);
            if (user!=null){
                request.getSession().setAttribute("user", user);
                response.sendRedirect(request.getContextPath() + "/goods/list.do");
            }else {
                response.sendRedirect(request.getContextPath()+"/login.jsp");
            }
        } catch (NameException e) {
            e.printStackTrace();
        }
    }
}
