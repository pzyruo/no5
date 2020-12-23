package com.pzyruo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = { "*.do" }, initParams = @WebInitParam(name = "encoding", value = "utf-8"))
public class EncodingFilter implements Filter {
    private String encoding;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;
        if(httpRequest.getMethod().equalsIgnoreCase("POST")){
            httpRequest.setCharacterEncoding(encoding);
        }

        chain.doFilter(httpRequest, httpResponse);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
