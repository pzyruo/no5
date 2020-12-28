package com.pzyruo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pzyruo.service.ItemService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/cart/updateNum.do")
public class CartUpdateNumController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int itemId = Integer.parseInt(request.getParameter("itemId"));
        int num = Integer.parseInt(request.getParameter("num"));
        //2
        ItemService itemService = new ItemService();
        itemService.updDateNum(itemId,num);
        //3
        Map<String,Object> map = new HashMap<>(10);
        map.put("isok",true);
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);
//        final String m = mapper.writeValueAsString(map);
//        System.out.println(m);

    }
}
