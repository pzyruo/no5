/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2020-12-30 01:24:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>登录页-澳猫团</title>\r\n");
      out.write("\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t<link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/base1.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/login.css\">\r\n");
      out.write("\t<!-- 视图窗口，移动端特属的标签。 -->\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width,initial-scale=1,maximum-scale=1,minimum-scale=1,user-scalable=no\" />\r\n");
      out.write("\t<link media=\"screen and (min-width: 992px) and (max-width:1200px)\" rel=\"stylesheet\" href=\"css/base1-small.css\">\r\n");
      out.write("\t<link media=\"screen and (min-width: 992px) and (max-width:1200px)\" rel=\"stylesheet\" href=\"css/login-small.css\">\r\n");
      out.write("\t<link media=\"screen and (min-width: 768px) and (max-width:991px)\" rel=\"stylesheet\" href=\"css/base1-pad.css\">\r\n");
      out.write("\t<link media=\"screen and (min-width: 768px) and (max-width:991px)\" rel=\"stylesheet\" href=\"css/login-pad.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 顶部 -->\r\n");
      out.write("\t<header>\r\n");
      out.write("\t\t<!-- 搜索和logo -->\r\n");
      out.write("\t\t<div class=\"logoAndSearch textWarp w1190 clearfix\">\r\n");
      out.write("\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t<a href=\"#\">澳猫网</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"LAStxt\">\r\n");
      out.write("\t\t\t\t欢迎登录\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"search\">\r\n");
      out.write("\t\t\t\t<div class=\"txt\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" placeholder=\"Swisse/澳洲\">\r\n");
      out.write("\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<a href=\"#\" class=\"btn\">\r\n");
      out.write("\t\t\t\t\t搜索\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">胶原蛋白</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">叶绿素</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">睡眠片</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">儿童维生素</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">鱼肝油</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">保健品</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a target=\"_blank\" href=\"#\">美容</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"BN\"><a target=\"_blank\" href=\"#\">运动保健</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t<!-- 中间内容 -->\r\n");
      out.write("\t<div class=\"mainArea\">\r\n");
      out.write("\t\t<div class=\"mainAreaW textWarp w1190\">\r\n");
      out.write("\t\t\t<div class=\"mainContent boxS\">\r\n");
      out.write("\t\t\t\t<div class=\"MCup clearfix\">\r\n");
      out.write("\t\t\t\t\t<div class=\"MCright W310\">\r\n");
      out.write("\t\t\t\t\t\t<h3 class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>登录澳猫团</span>\r\n");
      out.write("\t\t\t\t\t\t\t<a target=\"_blank\" href=\"register.html\">免费注册</a>\r\n");
      out.write("\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/userLogin.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"userName\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"W310\" placeholder=\"请输入您的手机号\" type=\"text\" name=\"userPhone\" id=\"userPhone\">\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"passWord\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input class=\"W310\" placeholder=\"请输入密码\" type=\"password\" name=\"userPass\" id=\"userPass\">\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"clearfix yzm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"验证码\" name=\"userCode\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"YP\"><a href=\"javascript:void(0)\" id=\"sendCode_a\">发送验证码</a></span>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"clearfix Jzmm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"checkbox checked\"></span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>记住密码</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a target=\"_blank\" href=\"#\">忘记密码？</a>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" class=\"loGin W310\" value=\"登陆\">\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"MCleft W115\">\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/AppEr.png\" alt=\"二维码\">\r\n");
      out.write("\t\t\t\t\t\t<p>扫码下载客户端</p>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"pL\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>手机可直接访问</span>\r\n");
      out.write("\t\t\t\t\t\t\t<strong>m.aumalls.com</strong>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"MCdown\">\r\n");
      out.write("\t\t\t\t\t<p>使用其他账户登录</p>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">QQ登录</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">微博登录</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">腾讯微博</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">微信登录</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"clearfix BN\">\r\n");
      out.write("\t\t\t\t\t\t\t<em></em>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">百度登录</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- 底部 -->\r\n");
      out.write("\t<footer>\r\n");
      out.write("\t\t<div class=\"txt textWarp w1190\">       \r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">关于澳猫海淘</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">商家入驻</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">网站合作</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">友情链接</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">澳猫公益</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">法律声明</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">诚聘英才</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">联系我们</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">网站地图</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<p>\r\n");
      out.write("\t\t\t\t澳大利亚Health more - 河南康多多贸易有限公司 - 河南澳蜜电子商务有限公司 版权所有<br>\r\n");
      out.write("\t\t\t\tCopyright © 20015-2018  澳猫aumalls.com 版权所有, 豫ICP备15030837号-1\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<div class=\"ALLN\"></div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<script src=\"js/jquery-1.7.2.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/jquery.lazyload.min.js\"></script>\r\n");
      out.write("\t<script src=\"js/login.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#sendCode_a\").click(function(){\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype:\"POST\",\r\n");
      out.write("\t\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/send.do\",\r\n");
      out.write("\t\t\t\tdata:{\"userPhone\":$(\"#userPhone\").val()},\r\n");
      out.write("\t\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\t\tsuccess:function(msg){\r\n");
      out.write("\t\t\t\t\tif(msg.isSend){\r\n");
      out.write("\t\t\t\t\t\talert(\"发送成功！\");\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\talert(\"发送失败！\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
