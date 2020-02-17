<%--
  Created by IntelliJ IDEA.
  User: bn
  Date: 2020/2/14
  Time: 13:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Login/Check" method="post">
    name: <input type="text" name="name"><br>
    password:<input type="password" name="password">
    <input type="submit" value="提交">
</form>
</body>
</html>
