package com.pzyruo.controller;

import com.alipay.api.internal.util.AlipaySignature;
import com.pzyruo.controller.alipay.AlipayConfig;
import com.pzyruo.domain.Orders;
import com.pzyruo.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@WebServlet("/order/payCallback.do")
public class OrderPayCallback extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            /*
             * * 功能：支付宝服务器同步通知页面 日期：2017-03-30 说明：
             * 以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
             * 该代码仅供学习和研究支付宝接口使用，只是提供一个参考。 页面功能说明*************************
             * 该页面仅做页面展示，业务逻辑处理请勿在该页面执行
             */
            // 获取支付宝GET过来反馈信息
            Map<String, String> params = new HashMap<String, String>();
            Map<String, String[]> requestParams = request.getParameterMap();
            for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
                String name = (String) iter.next();
                String[] values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
                }
                // 乱码解决，这段代码在出现乱码时使用
                valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
                params.put(name, valueStr);
            }
            // 验签
            boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key,
                    AlipayConfig.charset, AlipayConfig.sign_type); // 调用SDK验证签名
            // ——请在这里编写您的程序（以下代码仅作参考）——
            if (signVerified) {
                // 商户订单号
                String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");
                // 支付宝交易号
                String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");
                // 付款金额
                String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");
                // String body=new  String(request.getParameter("body").getBytes("ISO-8859-1"),"UTF-8");
                // 修改订单号的状态
                OrderService orderService = new OrderService();
                Orders orders = new Orders();
                orders.setOrderId(out_trade_no);
                orderService.pay(orders);
                // ——请在这里编写您的程序——
                request.getRequestDispatcher("/memer/allorder.jsp").forward(request, response);

            } else {
                // out.println("验签失败");
                request.setAttribute("reuslt", "支付失败");
                request.getRequestDispatcher("/payError.jsp").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
