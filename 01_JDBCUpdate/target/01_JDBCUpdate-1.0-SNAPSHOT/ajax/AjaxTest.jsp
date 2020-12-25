<%--
  Created by IntelliJ IDEA.
  User: 我的电脑
  Date: 2020/12/23
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link rel="stylesheet" href="/js/jquery-1.7.1.min.js">
</head>
<body>

<script>
    $(function (){
        $("#dj").click(function (){
            $.ajax({
                type:"post",
                utl:"ajax/test.do",
                data:{id:25,name:"张三"},
                success:function (result){
                    for (var i=0;i<result.length;i++){
                        var userTr = $("<tr></tr>");
                        var userIdTd = $("<td></td>");
                        $(userIdTd).html(result[i].id)
                        var userNameTd = $("<td></td>");
                        $(userNameTd).html(result[i].name)
                        $(userTr).append(userIdTd)
                        $(userTr).append(userNameTd)
                    }
                },
                dataType:"json"
            })
        })
    })



</script>
<input type="button" value="按这里" id="dj" >

<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>

    <tr id="dataBody">

    </tr>
</table>

</body>
</html>
