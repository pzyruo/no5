package com.pzyruo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsRequest;
import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.pzyruo.util.RandomUtil;
import org.json.simple.JSONObject;

@WebServlet("/alSend.do")
public class ALSendController extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("al");
		// 设置超时时间-可自行调整
		System.setProperty("sun.net.client.defaultConnectTimeout", "10000");
		System.setProperty("sun.net.client.defaultReadTimeout", "10000");
		// 初始化ascClient需要的几个参数
		final String product = "Dysmsapi";// 短信API产品名称
		final String domain = "dysmsapi.aliyuncs.com";// 短信API产品域名
		// 替换成你的AK
		final String accessKeyId = "121321";// 你的accessKeyId,参考本文档步骤2
		final String accessKeySecret = "213213212";// 你的accessKeySecret，参考本文档步骤2
		// 初始化ascClient,暂时不支持多region
		IClientProfile profile = DefaultProfile.getProfile("cn-hangzhou", accessKeyId, accessKeySecret);
		try {
			DefaultProfile.addEndpoint("cn-hangzhou", "cn-hangzhou", product, domain);
		} catch (ClientException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		IAcsClient acsClient = new DefaultAcsClient(profile);
		// 组装请求对象
		SendSmsRequest sendrequest = new SendSmsRequest();
		// 必填:待发送手机号。支持以逗号分隔的形式进行批量调用，
		// 批量上限为20个手机号码,批量调用相对于单条调用及时性稍有延迟,验证码类型的短信推荐使用单条调用的方式
		String userPhone = request.getParameter("userPhone");
		sendrequest.setPhoneNumbers(userPhone);
		// 必填:短信签名-可在短信控制台中找到
		sendrequest.setSignName("peter孙");
		// 必填:短信模板-可在短信控制台中找到
		sendrequest.setTemplateCode("SMS_74545011");
		// 可选:模板中的变量替换JSON串,如模板内容为"亲爱的${name},您的验证码为${code}"时,此处的值为
		int code = RandomUtil.getRandomCode();
		sendrequest.setTemplateParam("{\"code\":\"" + code + "\"}");
		HttpSession session = request.getSession();
		session.setAttribute("code", code);
		System.out.println(code);
		// 可选:outId为提供给业务方扩展字段,最终在短信回执消息中将此值带回给调用者
		sendrequest.setOutId("yourOutId");
		// 请求失败这里会抛ClientException异常
		SendSmsResponse sendSmsResponse;
		try {
			sendSmsResponse = acsClient.getAcsResponse(sendrequest);
			if (sendSmsResponse.getCode() != null && sendSmsResponse.getCode().equals("OK")) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("isSend", true);
				response.getWriter().print(jsonObject.toString());
			} else {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("isSend", false);
				response.getWriter().print(jsonObject.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
