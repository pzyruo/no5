/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2020-12-25 08:43:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    <title>后台管理登录</title>\r\n");
      out.write("    <link href=\"images/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\tbackground-color: #016aa9;\r\n");
      out.write("\toverflow:hidden;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body><form name=\"adminloginform\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/adminLogin.do\" method=\"post\">\r\n");
      out.write(" <table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"962\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"235\" background=\"images/login_03.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"53\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"394\" height=\"53\" background=\"images/login_05.gif\">&nbsp;</td>\r\n");
      out.write("            <td width=\"206\" background=\"images/login_06.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"16%\" height=\"25\"><div align=\"right\"><span class=\"STYLE1\">用户</span></div></td>\r\n");
      out.write("                <td width=\"57%\" height=\"25\"><div align=\"center\">\r\n");
      out.write("                  <input type=\"text\" name=\"adminName\" style=\"width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff\">\r\n");
      out.write("                </div></td>\r\n");
      out.write("                <td width=\"27%\" height=\"25\">&nbsp;</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"25\"><div align=\"right\"><span class=\"STYLE1\">密码</span></div></td>\r\n");
      out.write("                <td height=\"25\"><div align=\"center\">\r\n");
      out.write("                  <input type=\"password\" name=\"adminPass\" style=\"width:105px; height:17px; background-color:#292929; border:solid 1px #7dbad7; font-size:12px; color:#6cd0ff\">\r\n");
      out.write("                </div></td>\r\n");
      out.write("                <td height=\"25\"><div align=\"left\"><a href=\"javascript:document.adminloginform.submit()\"><img src=\"images/dl.gif\" width=\"49\" height=\"18\" border=\"0\"></a></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"362\" background=\"images/login_07.gif\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td height=\"213\" background=\"images/login_08.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table></form>\r\n");
      out.write("  </body>\r\n");
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
