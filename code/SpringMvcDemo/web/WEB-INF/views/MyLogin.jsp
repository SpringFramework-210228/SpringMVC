<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
<!-- 使用message标签来输出国际化信息 -->
<h4><spring:message code="title"/></h4>
<%--@elvariable id="user" type="com.ak.Pojo.MyUser"--%>
<form:form modelAttribute="user" method="post" action="${pageContext.request.contextPath}/login2">
    <table>
        <tr>
            <td><spring:message code="loginname"/></td>
            <td><input type="text" name="loginname"></td>
        </tr>
        <tr>
            <td><spring:message code="password"/></td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="<spring:message code="submit"/>"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>