<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
function gotoPage(p){
	//当前页面的默认值是1，当点击下一页的时候，将当前页码加一，并将表单再次提交
	document.searchForm.page.value=p;
	document.searchForm.submit();
}
</script>
<body>
<center>
<form id="searchForm" name="searchForm" action="${pageContext.request.contextPath }/goods/search.do" method="post">
<input type="hidden" name="page" id="page" value="1">
商品名称：<input name="goodsName" value="${param.goodsName }"> &nbsp;
商品价格：<input name="minGoodsPrice" value="${param.minGoodsPrice }" size="5">
			 -<input name="maxGoodsPrice" value="${param.maxGoodsPrice }" size="5"> &nbsp;
商品类型：<select name="typeId">
			<option value="-1">所有类型</option>
<c:forEach items="${applicationScope.typeList }" var="type">
		<c:choose>
			<c:when test="${ type.typeId eq param.typeId }">
				<option value="${type.typeId }" selected="selected">${type.typeName }</option>
			</c:when>
			<c:otherwise>
				<option value="${type.typeId }" >${type.typeName }</option>
			</c:otherwise>
		</c:choose>
</c:forEach>
</select>&nbsp;
<input type="submit" value="查询">
</form>


</center>
<hr>
<table border="1px" cellpadding="1" cellspacing="0" width="80%" align="center">
	<tr> <td>编号</td> <td>图片</td> <td>名称</td> <td>价格</td> <td>数量</td> <td>类型</td>	</tr>
	<c:forEach items="${ requestScope.goodsList }" var="goods" varStatus="status">
	<tr>
		<td>${status.count}</td>
		<td><img src="${pageContext.request.contextPath }/img/${goods.goodsImg}" width="25" height="25"></td>
		<td>${goods.goodsName }</td>
		<td>${goods.goodsPrice }</td>
		<td>${goods.goodsNum }</td>
		<td>${goods.goodsType.typeName }</td>
	</tr>
	</c:forEach>
</table>
<hr>
${requestScope.pageVO.page }/${requestScope.pageVO.pageCount}<br>
每页${requestScope.pageVO.recordOfPage }记录,共${requestScope.pageVO.recordCount }记录<br>

<c:forEach begin="1" end="${requestScope.pageVO.pageCount}" var="pa">
	<c:choose>
		<c:when test="${ pa eq requestScope.pageVO.page }">
			&nbsp; ${ pa }&nbsp;
		</c:when>
		<c:otherwise>
			&nbsp; <a href="javascript:gotoPage(${pa})">${ pa }</a>&nbsp;
		</c:otherwise>
	</c:choose>
</c:forEach>

<c:choose>
	<c:when test="${requestScope.pageVO.page eq requestScope.pageVO.pageCount}">
		下一页
	</c:when>
	<c:otherwise>
		<a href="javascript:gotoPage(${requestScope.pageVO.page+1})">下一页</a>
	</c:otherwise>
</c:choose>
</body>
</html>




