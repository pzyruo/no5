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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int itemId = Integer.parseInt(request.getParameter("itemId"));
        int num = Integer.parseInt(request.getParameter("num"));
        //2
        ItemService itemService = new ItemService();
        itemService.updDateNum(itemId,num);
        //3
        System.out.println(itemId+"我是id");
        System.out.println("我是数量"+num);
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> map = new HashMap<>();
        map.put("isok",true);
        String s = mapper.writeValueAsString(map);
        System.out.println(s);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
