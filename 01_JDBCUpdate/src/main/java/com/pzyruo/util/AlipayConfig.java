package com.pzyruo.util;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: AlipayConfig <br/>
 * Description: <br/>
 * date: 2019/10/29 10:43<br/>
 *
 * @author zhaoran<br />
 * @since JDK 1.8
 */
public class AlipayConfig {
	// ↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101600699606";

	// 商户私钥，您的PKCS8格式RSA2私钥
	public static String merchant_private_key = "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";
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm
	// 对应APPID下的支付宝公钥。
	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhegiYSxik6FX85aRYBS5Phgi0wG0RkrtfzlECDRGnDs7umtUIEXBCqnDYAccrTeseaAxi5sDsm9mCBpy5tNEi/xEH1jBZRRj95APqnv9Yf8d9IdgaT1CurQwyAXrVErJbZ6xL/YNM6Up5RCG58qBYMqtxIgyZF9l3kYvSIJjfEWK2Ebh1xRup73Mqawf8acAa9NrLEKudYV1qPWXGjS24adUNLfv7EBEmQFLljM62sVEbAfKfkQG8PiL9HSOqbay9uVU8NFSR0IlD5vTWuMcExFBqym8BduzFCXVVPYfkV9YIP6TlY8U52CLm/1tYupL/R9vo8HSDQFTZjZrwcdsVQIDAQAB/i/3zDHAjEsTA202ND0+rR7+eF4OrKrC2UtYe63ihQQamGDcGtyZbCZPi+DwMFHJJQ7UO7dbqz84uwTf+BXElDBtslg5O0WZ3ZgJdAOyx832Y/KAbMzRSYMxDY3P5J1hGtsEyU3hGtQwhv0hFAIk+B74ncOVEz3eUQ6+XzXBMTCkjdJbxl9BJZSDy4InfMgcv0LRYf4p/Sf42DQ65MlrAwIZvhM/vZ0rpW3wxidJ0L14LFfMl+NWOWrvTh5k8D0OUsgteDIl9ShW9Agp1B7afC4k8ldtI/SnhewIDAQAB";
	// 服务器异步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/alipayresult.do";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/alipayresult.do";

	// 签名方式
	public static String sign_type = "RSA2";

	// 字符编码格式
	public static String charset = "utf-8";

	// 支付宝网关 //
	// public static String gatewayUrl =
	// "https://openapi.alipay.com/gateway.do";// 正式
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";// 测试

	// 支付宝网关 日志
	public static String log_path = "D:\\alipay\\";

	// ↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
	/**
	 * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
	 * 
	 * @param sWord
	 *            要写入日志里的文本内容
	 */
	public static void logResult(String sWord) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
			writer.write(sWord);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}