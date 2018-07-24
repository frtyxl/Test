<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 12414
  Date: 2018/7/21
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<div id="content">
    <div id="from">
        <h1>用户登录</h1><br/>
        <form action="login.jsp" method="post" id="myforrm" onsubmit="return validate">
            用户名<input type="text" id="username" name="username">
            密码<input type="password" id="passwor" name="password">
            <input type="submit" value="登录">
            <input type="submit" value="查询">
            <input type="submit" value="注册">
        </form>
        <tr>
            <td>id</td>
            <td>username</td>
        </tr>
        <c:forEach items="${userlist}" var="user">
        <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        </tr>
        </c:forEach>
    </div>
</div>
</body>
</html>
