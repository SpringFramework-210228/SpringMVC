<%--
  Created by IntelliJ IDEA.
  User: bn
  Date: 2020/2/14
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用来测试 Pojo 类型数据的</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/Pojo/User" method="post">
    id: <input type="number" name="id"><br>
    name: <input name="name" type="text"> <br>
    score: <input name="score" type="text"><br>
    <input type="submit" value="这个测试提交实体类信息，跳转页面">
</form>
<br>
<form action="${pageContext.request.contextPath}/Pojo/Model" method="post">
    id: <input type="number" name="id"><br>
    name: <input name="name" type="text"> <br>
    score: <input name="score" type="text"><br>
    <input type="submit" value="这个测试提交给Model，跳转页面 ">
</form>
<br>
<form action="${pageContext.request.contextPath}/Pojo/Map" method="post">
    id: <input type="number" name="id"><br>
    name: <input name="name" type="text"> <br>
    score: <input name="score" type="text"><br>
    <input type="submit" value="这个测试提交给Map,跳转页面 ">
</form>
<br>
<form action="${pageContext.request.contextPath}/Pojo/ModelMap" method="post">
    id: <input type="number" name="id"><br>
    name: <input name="name" type="text"> <br>
    score: <input name="score" type="text"><br>
    <input type="submit" value="这个测试提交给ModelMap,跳转页面 ">
</form>
<br>
<form action="${pageContext.request.contextPath}/Pojo/ModelAndView" method="post">
    id: <input type="number" name="id"><br>
    name: <input name="name" type="text"> <br>
    score: <input name="score" type="text"><br>
    <input type="submit" value="这个测试提交给ModelView，跳转页面 ">
</form>

</body>
</html>
