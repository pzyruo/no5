<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>支付宝电脑网站支付</title>
</head>
<body text=#000000 bgColor="#ffffff" leftMargin=0 topMargin=4>
<header class="am-header">
    <h1>支付宝电脑网站支付体验入口页</h1>
</header>
<div id="main">

    <form name=alipayment action="${pageContext.request.contextPath}/order/pay.do" method=post
          target="_blank">
        <div id="body1" class="show" name="divcontent">
            <dl class="content">
                <dt>商户订单号 ：</dt>
                <dd>
                    <input id="WIDout_trade_no" name="WIDout_trade_no" />
                </dd>
                <hr class="one_line">
                <dt>订单名称 ：</dt>
                <dd>
                    <input id="WIDsubject" name="WIDsubject" />
                </dd>
                <hr class="one_line">
                <dt>付款金额 ：</dt>
                <dd>
                    <input id="WIDtotal_amount" name="WIDtotal_amount" />
                </dd>
                <hr class="one_line">
                <dt>商品描述：</dt>
                <dd>
                    <input id="WIDbody" name="WIDbody" />
                </dd>
                <hr class="one_line">
                <dt></dt>
                <dd id="btn-dd">
						<span class="new-btn-login-sp">
							<button class="new-btn-login" type="submit"
                                    style="text-align: center;">付 款</button>
						</span>
                </dd>
            </dl>
        </div>
    </form>

    <div id="foot">
        <ul class="foot-ul">
            <li>支付宝版权所有 2015-2018 ALIPAY.COM</li>
        </ul>
    </div>
</div>
</body>

</html>