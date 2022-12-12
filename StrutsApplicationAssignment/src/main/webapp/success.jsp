<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.java.form.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Employee e1=(Employee)request.getAttribute("employee");
request.setAttribute("employee", e1);
%>
welcome to struts
${employee.id }</br>
${employee.name }</br>
${employee.email }</br>
${employee.mobile }</br>
${employee.hobbies }</br>


</body>
</html>