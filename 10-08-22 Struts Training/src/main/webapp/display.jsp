<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>Hi</h1>
<!-- <body>
First Program
<h1>Welcome to Display page</h1>
</body> -->
<body>
<!-- Second program -->
<logic:iterate name="employee"  id="emp">
<bean:write name="emp" property="id"></bean:write></br>
<bean:write name="emp" property="name"></bean:write></br>
<bean:write name="emp" property="email"></bean:write></br>
<bean:write name="emp" property="mobile"></bean:write></br>

</logic:iterate>
</body> 
</html>