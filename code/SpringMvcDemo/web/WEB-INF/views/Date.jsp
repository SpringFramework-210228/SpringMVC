<%--
  Created by IntelliJ IDEA.
  User: bn
  Date: 2020/2/14
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用来测试 自定义转换器的</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/Date/Test" method="post">
    <input type="date" name="date1">
    <input type="text" name="date2">
    <input type="text" name="date3">
    <input type="submit" value="时间类型的测试">
</form>


</body>
</html>
