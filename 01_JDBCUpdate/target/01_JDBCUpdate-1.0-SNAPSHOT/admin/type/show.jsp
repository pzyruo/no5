<%@page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<style type="text/css">
<!--
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: underline;
}
a:active {
	text-decoration: none;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.STYLE1 {font-size: 12px}
.STYLE3 {font-size: 12px; font-weight: bold; }
.STYLE4 {
	color: #03515d;
	font-size: 12px;
}
-->
</style>
</head>
  
  <body>
 <table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" background="images/tab_05.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="30"><img src="images/tab_03.gif" width="12" height="30" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="46%" valign="middle"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td width="5%"><div align="center"><img src="images/tb.gif" width="16" height="16" /></div></td>
                <td width="95%" class="STYLE1"><span class="STYLE3">你当前的位置</span>：[基础数据管理]-[商品类型管理]</td>
              </tr>
            </table></td>
            <td width="54%"><table border="0" align="right" cellpadding="0" cellspacing="0">
              <tr>
                <td width="60"><table width="87%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center">
                      <input type="checkbox" name="cbox_all" id="cbox_all" value="checkbox" />
                    </div></td>
                    <td class="STYLE1"><div align="center">全选</div></td>
                  </tr>
                </table></td>
                <td width="100"><table width="90%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"><img src="images/22.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center"><A href="/admin/type/saveone.jsp">新增一级类型</A></div></td>
                  </tr>
                </table></td>
                <td width="52"><table width="88%" border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td class="STYLE1"><div align="center"><img src="images/11.gif" width="14" height="14" /></div></td>
                    <td class="STYLE1"><div align="center"><A href="javascript:void(0)">删除</A></div></td>
                  </tr>
                </table></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="16"><img src="images/tab_07.gif" width="16" height="30" /></td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="8" background="images/tab_12.gif">&nbsp;</td>
        <td><form  name="deletesForm"  method="post">
        <!-- 商品类型显示 -->
		<table width="100%" border="0" cellpadding="0" cellspacing="1" bgcolor="b5d6e6" onmouseover="changeto()"  onmouseout="changeback()">
		<tr>
		  <td width="3%" height="19" background="images/bg.gif" bgcolor="#FFFFFF"><div align="center">
		  </div></td>
		  <td width="3%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">序号</span></div></td>
		  <td width="8%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">商品类型编号</span></div></td>
		  <td width="18%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">商品类型名称</span></div></td>
		  <td width="12%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">商品父类型</span></div></td>
		  <td width="10%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">商品类型级别</span></div></td>
		  <td width="16%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">商品类型路径</span></div></td>
		  <td width="14%" height="19" background="images/bg.gif" bgcolor="#FFFFFF" nowrap="nowrap">
			<div align="center"><span class="STYLE1">基本操作</span></div></td>
		</tr>
		<c:choose>
		<c:when test="${empty requestScope.typesList}">
		<!-- 提示错误文本 -->
		<tr><td colspan="8" align="center" bgcolor="#FFFFFF"><div class="STYLE1" style="font-size:25px;color:red;">本次查询没有商品类型！</div></td></tr>
		<!-- 提示错误文本 end-->
		</c:when>
		<c:otherwise>
		<!-- 数据显示 -->
		<c:forEach items="${requestScope.typesList}" var="type" varStatus="status">
		<tr>
		  <td height="20" bgcolor="#FFFFFF"><div align="center">
		    <input type="checkbox" name="typeIds"/>
		  </div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="center" class="STYLE1">
		    <div align="center">${status.count }</div>
		  </div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="center">
			<span class="STYLE1">${type.typeId }</span></div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="center">
			<span class="STYLE1">${type.typeName }</span></div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="center">
			<span class="STYLE1">${type.ptype.typeId}</span></div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="center">
			<span class="STYLE1">${type.typeLevel }</span></div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="left">
			<span class="STYLE1">&nbsp;${type.typePath }&nbsp;</span></div></td>
		  <td height="20" bgcolor="#FFFFFF"><div align="center"><span class="STYLE4">
		    <img src="images/22.gif" width="16" height="16" />
		    <A href="admin/types/searchByID.do?typeId=${type.typeId }">增加子级类型</A>&nbsp; &nbsp;
			<img src="images/edt.gif" width="16" height="16" />
			<A href="javascript:void(0);">编辑</A>&nbsp; &nbsp;
			<img src="images/del.gif" width="16" height="16" />
			<A href="javascript:void(0);">删除</A></span></div></td>
		</tr>
		</c:forEach>
		</c:otherwise>
		</c:choose>
		<!-- 数据显示 end-->
		</table>
		<!-- 商品类型显示 end-->
		</form></td>
        <td width="8" background="images/tab_15.gif">&nbsp;</td>
      </tr>
    </table></td>
  </tr>
  <tr>
    <td height="35" background="images/tab_19.gif"><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="12" height="35"><img src="images/tab_18.gif" width="12" height="35" /></td>
        <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="STYLE4">&nbsp;&nbsp;共有${requestScope.pageVO.recordCount }条记录，当前第${requestScope.pageVO.page }/${requestScope.pageVO.pageCount }页</td>
            <td><table border="0" align="right" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="40"><img src="images/first.gif" width="37" height="15" /></td>
                  <td width="45"><img src="images/back.gif" width="43" height="15" /></td>
                  <td width="45"><img src="images/next.gif" width="43" height="15" /></td>
                  <td width="40"><img src="images/last.gif" width="37" height="15" /></td>
                  <td width="100"><div align="center"><span class="STYLE1">转到第<input name="textfield" type="text" size="4" style="height:12px; width:20px; border:1px solid #999999;" /> 
                    	页 </span></div></td>
                  <td width="40"><img src="images/go.gif" width="37" height="15" /></td>
                </tr>
            </table></td>
          </tr>
        </table></td>
        <td width="16"><img src="images/tab_20.gif" width="16" height="35" /></td>
      </tr>
    </table></td>
  </tr>
</table>
  </body>
</html>
