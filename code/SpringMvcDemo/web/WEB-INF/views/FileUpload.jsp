<%--
  Created by IntelliJ IDEA.
  User: bn
  Date: 2020/2/14
  Time: 17:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

${error}
<form action="${pageContext.request.contextPath}/File/More" method="post" enctype="multipart/form-data">
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="text" name="name"><br>
    <input type="submit" value="多文件提交">
</form>
<br>
<form action="${pageContext.request.contextPath}/File/One" method="post" enctype="multipart/form-data">
    <input type="text" name="name"><br>
    <input type="file" name="file"><br>
    <input type="submit" value="单文件提交"><br>
</form>
</body>
</html>
