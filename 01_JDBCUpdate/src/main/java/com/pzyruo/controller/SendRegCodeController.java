package com.pzyruo.controller;

import com.pzyruo.util.RandomUtil;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.simple.JSONObject;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * @author 我的电脑
 */
@WebServlet("/send.do")
public class SendRegCodeController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userPhone = request.getParameter("userPhone");
		int code = RandomUtil.getRandomCode();
		HttpSession session = request.getSession();
		session.setAttribute("code", code);
		System.out.println(code);

		HttpClient client = new HttpClient();
		PostMethod post = new PostMethod("http://utf8.sms.webchinese.cn");
		// 在头文件中设置转码
		post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
		NameValuePair[] data = { new NameValuePair("Uid", "你的用户名"), new NameValuePair("Key", "你的key"),
				new NameValuePair("smsMob", userPhone), new NameValuePair("smsText", "验证码:" + code) };
		post.setRequestBody(data);
		int i = client.executeMethod(post);
		Header[] headers = post.getResponseHeaders();
		int statusCode = post.getStatusCode();
		System.out.println("statusCode:" + statusCode);
		for (Header h : headers) {
			System.out.println(h.toString());
		}

		String result = new String(post.getResponseBodyAsString().getBytes("UTF-8"));
		// 打印返回消息状态
		System.out.println(result);
		if ("1".equals(result)) {
			post.releaseConnection();
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("isSend", true);
			response.getWriter().print(jsonObject.toString());
		} else {
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("isSend", false);
			response.getWriter().print(jsonObject.toString());
		}
	}

}
