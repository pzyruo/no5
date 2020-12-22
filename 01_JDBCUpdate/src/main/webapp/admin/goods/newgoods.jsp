<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<base href="<%=basePath%>">

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/kindeditor/themes/default/default.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/kindeditor/plugins/code/prettify.css">
	<script type="text/javascript" src="${pageContext.request.contextPath }/kindeditor/kindeditor-all-min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/kindeditor/lang/zh-CN.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/kindeditor/plugins/code/prettify.js"></script>

</head>
<script>
	KindEditor.ready(function(K) {
		var editor1 = K.create('#goodsDetails', {
			cssPath : '<%=path%>/css/prettify.css',
			uploadJson : '${pageContext.request.contextPath }/kindeditor/upload_json.jsp',
			fileManagerJson : '${pageContext.request.contextPath }/kindeditor/file_manager_json.jsp'
		});
	});
</script>

<body>
<form action="${pageContext.request.contextPath }/admin/goods/save.do" method="post" enctype="multipart/form-data" >
	商品名称：<input name="goodsName" value="${param.goodsName }">
	<font color="red">${ requestScope.errorInfo }</font>
	<br>
	商品价格：<input name="goodsPrice" value="${param.goodsPrice }"><br>
	商品数量：<input name="goodsNum" value="${param.goodsNum }"><br>
	商品类型：<select name="typeId">
			<c:forEach items="${applicationScope.typeList}" var="type" varStatus="status">
				<option value="${type.typeId}"  ${param.typeId eq type.typeId ? 'selected':'' }>${type.typeName}</option>
			</c:forEach>
					</select><br>
	商品图片：<br><input type="file" name="goodsImg" ><br>
	商品详细：<textarea name="goodsDetails" id="goodsDetails" cols="20" rows="6"></textarea>
	<input type="submit" value="保存">
</form>
</body>
</html>