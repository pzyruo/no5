package com.pzyruo.controller;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.pzyruo.controller.alipay.AlipayConfig;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/order/pay.do")
public class OrderPayController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 获得初始化的AlipayClient
        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
                AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
                AlipayConfig.sign_type);
        // 设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
        // 商户订单号，商户网站订单系统中唯一订单号，必填
        String out_trade_no;
        // 付款金额，必填
        String total_amount;
        // 订单名称，必填
        String subject;
        // 商品描述，可空
        String body;
        try {
            out_trade_no = request.getParameter("orderId");
            total_amount = request.getParameter("orderPrice");
            subject = request.getParameter("orderName");
            body = "";
            alipayRequest.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\""
                    + total_amount + "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
                    + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
            // 请求
            String result = alipayClient.pageExecute(alipayRequest).getBody();
            // 输出 pay页面取出
            request.setAttribute("result", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 这个是渲染到视图中,在pay视图中使用el方式将 result对象数据展示,由result对象进行向阿里支付系统发送构建的请求
        request.getRequestDispatcher("/alipay/pay.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
