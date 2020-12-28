package com.pzyruo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@WebFilter( urlPatterns={  "/admin/*" } , dispatcherTypes={DispatcherType.REQUEST,DispatcherType.FORWARD,DispatcherType.ASYNC})
public class AdminLoginFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("AdminLoginFilter.doFilter");
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;

        HttpSession session = httpRequest.getSession();
        if (session.getAttribute("admin") != null) {
            // 放行
            chain.doFilter(httpRequest, httpResponse);
        } else {
            httpResponse.sendRedirect(httpRequest.getContextPath()+"/adminlogin.jsp");
        }    }

    @Override
    public void init(FilterConfig config) throws ServletException {

    }

}
