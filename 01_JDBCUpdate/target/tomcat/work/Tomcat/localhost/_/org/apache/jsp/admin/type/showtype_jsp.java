/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2020-12-22 11:32:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin.type;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class showtype_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");

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
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("a:link {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:visited {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("a:hover {\r\n");
      out.write("\ttext-decoration: underline;\r\n");
      out.write("}\r\n");
      out.write("a:active {\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {font-size: 12px}\r\n");
      out.write(".STYLE3 {font-size: 12px; font-weight: bold; }\r\n");
      out.write(".STYLE4 {\r\n");
      out.write("\tcolor: #03515d;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write(" <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" background=\"images/tab_05.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"30\"><img src=\"images/tab_03.gif\" width=\"12\" height=\"30\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"46%\" valign=\"middle\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"5%\"><div align=\"center\"><img src=\"images/tb.gif\" width=\"16\" height=\"16\" /></div></td>\r\n");
      out.write("                  <td width=\"95%\" class=\"STYLE1\"><span class=\"STYLE3\">类型信息</span>></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"54%\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"images/tab_07.gif\" width=\"16\" height=\"30\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_12.gif\">&nbsp;</td>\r\n");
      out.write("        <td><form  name=\"deletesForm\"  method=\"post\">\r\n");
      out.write("        <!-- 商品类型显示 -->\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"b5d6e6\" onmouseover=\"changeto()\"  onmouseout=\"changeback()\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"3%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("\t\t  </div></td>\r\n");
      out.write("\t\t  <td width=\"3%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">序号</span></div></td>\r\n");
      out.write("\t\t  <td width=\"8%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型编号</span></div></td>\r\n");
      out.write("\t\t  <td width=\"18%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型名称</span></div></td>\r\n");
      out.write("\t\t  <td width=\"12%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品父类型</span></div></td>\r\n");
      out.write("\t\t  <td width=\"10%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型级别</span></div></td>\r\n");
      out.write("\t\t  <td width=\"16%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型路径</span></div></td>\r\n");
      out.write("\t\t  <td width=\"14%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\"></span></div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"></div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\" class=\"STYLE1\">\r\n");
      out.write("\t\t    <div align=\"center\">1</div>\r\n");
      out.write("\t\t  </div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("\t\t\t<span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.type.typeId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("\t\t\t<span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.type.typeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("\t\t\t<span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empty requestScope.type.ptype ? '无': requestScope.type.ptype.typeName  }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("\t\t\t<span class=\"STYLE1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.type.typeLevel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"left\">\r\n");
      out.write("\t\t\t<span class=\"STYLE1\">&nbsp;");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.type.typePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;</span></div></td>\r\n");
      out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE4\"></span></div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<!-- 数据显示 end-->\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<!-- 商品类型显示 end-->\r\n");
      out.write("\t\t</form></td>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_15.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" background=\"images/tab_19.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"35\"><img src=\"images/tab_18.gif\" width=\"12\" height=\"35\" /></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"images/tab_20.gif\" width=\"16\" height=\"35\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" background=\"images/tab_05.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"30\"><img src=\"images/tab_03.gif\" width=\"12\" height=\"30\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"46%\" valign=\"middle\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"5%\"><div align=\"center\"><img src=\"images/tb.gif\" width=\"16\" height=\"16\" /></div></td>\r\n");
      out.write("                  <td width=\"95%\" class=\"STYLE1\"><span class=\"STYLE3\">子类型列表</span>></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"54%\"></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"images/tab_07.gif\" width=\"16\" height=\"30\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_12.gif\">&nbsp;</td>\r\n");
      out.write("        <td><form  name=\"deletesForm\"  method=\"post\">\r\n");
      out.write("        <!-- 商品类型显示 -->\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"b5d6e6\" onmouseover=\"changeto()\"  onmouseout=\"changeback()\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t  <td width=\"3%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
      out.write("\t\t  </div></td>\r\n");
      out.write("\t\t  <td width=\"3%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">序号</span></div></td>\r\n");
      out.write("\t\t  <td width=\"8%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型编号</span></div></td>\r\n");
      out.write("\t\t  <td width=\"18%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型名称</span></div></td>\r\n");
      out.write("\t\t  <td width=\"12%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品父类型</span></div></td>\r\n");
      out.write("\t\t  <td width=\"10%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型级别</span></div></td>\r\n");
      out.write("\t\t  <td width=\"16%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">商品类型路径</span></div></td>\r\n");
      out.write("\t\t  <td width=\"14%\" height=\"19\" background=\"images/bg.gif\" bgcolor=\"#FFFFFF\" nowrap=\"nowrap\">\r\n");
      out.write("\t\t\t<div align=\"center\"><span class=\"STYLE1\">基本操作</span></div></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<!-- 商品类型显示 end-->\r\n");
      out.write("\t\t</form></td>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_15.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" background=\"images/tab_19.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"35\"><img src=\"images/tab_18.gif\" width=\"12\" height=\"35\" /></td>\r\n");
      out.write("        <td></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"images/tab_20.gif\" width=\"16\" height=\"35\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write(" <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" background=\"images/tab_05.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"30\"><img src=\"images/tab_03.gif\" width=\"12\" height=\"30\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"46%\" valign=\"middle\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td width=\"5%\"><div align=\"center\"><img src=\"images/tb.gif\" width=\"16\" height=\"16\" /></div></td>\r\n");
      out.write("                <td width=\"95%\" class=\"STYLE1\"><span class=\"STYLE3\">你当前的位置</span>：[基础数据管理]-[<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/admin/type/search.do\">商品类型管理</a>]-[保存一级类型]</td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("            <td width=\"54%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"images/tab_07.gif\" width=\"16\" height=\"30\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_12.gif\">&nbsp;</td>\r\n");
      out.write("        <td><form  action=\"admin/type/oneSave.do\"\r\n");
      out.write("         method=\"post\" name=\"savegoodstypeform\" id=\"savegoodstypeform\">\r\n");
      out.write("          <table width=\"400\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"b5d6e6\" >\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td colspan=\"2\" height=\"19\" align=\"right\"  bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE1\" style=\"color:red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.error }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</span></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"32%\" height=\"19\" align=\"right\"  bgcolor=\"#FFFFFF\"><div align=\"right\"><span class=\"STYLE1\">类型名称：</span></div></td>\r\n");
      out.write("              <td width=\"68%\" height=\"19\" align=\"left\"  bgcolor=\"#FFFFFF\"><div align=\"left\"><span class=\"STYLE1\">\r\n");
      out.write("                <input type=\"text\" name=\"typeName\" id=\"typeName\">\r\n");
      out.write("              </span></div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td width=\"32%\" height=\"19\" align=\"right\"  bgcolor=\"#FFFFFF\"><div align=\"right\"><span class=\"STYLE1\">&nbsp;</span></div></td>\r\n");
      out.write("              <td width=\"68%\" height=\"19\" align=\"left\"  bgcolor=\"#FFFFFF\"><div align=\"left\"><span class=\"STYLE1\">\r\n");
      out.write("                <input type=\"submit\" value=\"保存\" >\r\n");
      out.write("                </span>\r\n");
      out.write("                <input type=\"reset\" id=\"button\" value=\"重置\">\r\n");
      out.write("              </div></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("        </form></td>\r\n");
      out.write("        <td width=\"8\" background=\"images/tab_15.gif\">&nbsp;</td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"35\" background=\"images/tab_19.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"12\" height=\"35\"><img src=\"images/tab_18.gif\" width=\"12\" height=\"35\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td class=\"STYLE4\">&nbsp;</td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"16\"><img src=\"images/tab_20.gif\" width=\"16\" height=\"35\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f0.setParent(null);
    int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
    if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /admin/type/showtype.jsp(174,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty requestScope.type.typeList }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<tr><td colspan=\"8\" align=\"center\" bgcolor=\"#FFFFFF\"><div class=\"STYLE1\" style=\"font-size:36px;color:red;\">本次查询没有商品类型！</div></td></tr>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t<!-- 数据显示 -->\r\n");
        out.write("\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t<!-- 数据显示 end-->\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /admin/type/showtype.jsp(179,2) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/admin/type/showtype.jsp(179,2) '${requestScope.type.typeList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${requestScope.type.typeList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /admin/type/showtype.jsp(179,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("type");
    // /admin/type/showtype.jsp(179,2) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<tr>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
          out.write("\t\t    <input type=\"checkbox\" name=\"typeIds\"  />\r\n");
          out.write("\t\t  </div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\" class=\"STYLE1\">\r\n");
          out.write("\t\t    <div align=\"center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.count }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("\t\t  </div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
          out.write("\t\t\t<span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typeId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
          out.write("\t\t\t<span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
          out.write("\t\t\t<span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.type.typeName }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\">\r\n");
          out.write("\t\t\t<span class=\"STYLE1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typeLevel }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</span></div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"left\">\r\n");
          out.write("\t\t\t<span class=\"STYLE1\">&nbsp;");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${type.typePath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&nbsp;</span></div></td>\r\n");
          out.write("\t\t  <td height=\"20\" bgcolor=\"#FFFFFF\"><div align=\"center\"><span class=\"STYLE4\">\r\n");
          out.write("\t\t\t<img src=\"images/edt.gif\" width=\"16\" height=\"16\" />\r\n");
          out.write("\t\t\t<A href=\"javascript:void(0);\">编辑</A>&nbsp; &nbsp;\r\n");
          out.write("\t\t\t<img src=\"images/del.gif\" width=\"16\" height=\"16\" />\r\n");
          out.write("\t\t\t<A href=\"javascript:void(0);\">删除</A></span></div></td>\r\n");
          out.write("\t\t</tr>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
