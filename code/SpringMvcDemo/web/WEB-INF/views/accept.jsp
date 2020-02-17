<%@ page import="com.ak.Pojo.User" %><%--
  Created by IntelliJ IDEA.
  User: bn
  Date: 2020/2/14
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% User user=(User) request.getAttribute("user"); %>
<h1>${name}</h1>
<h1>${user.id}</h1>
<h1>${user.name}</h1>
<h1>${user.score}</h1>
<h1><%=user.getScore()%></h1>
</body>
</html>
