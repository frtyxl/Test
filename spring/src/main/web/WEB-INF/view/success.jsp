<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 12414
  Date: 2018/7/21
  Time: 0:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
<h3>登录成功，显示用户列表页面（主页） </h3>
<table>
<tr>
    <td>id</td>
    <td>用户名</td>
    ${user.id}
    ${user.username}
</tr>


<%--<c:forEach items="${userlist}" var="user">--%>
    <%--<tr>--%>
        <%--<td>${user.id}</td>--%>
        <%--<td>${user.username}</td>--%>
    <%--</tr>--%>
<%--</c:forEach>--%>
</table>
</body>
</html>
