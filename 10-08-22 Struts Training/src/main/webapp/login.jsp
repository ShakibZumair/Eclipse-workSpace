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
<body>
<html:form action="log.do">
<table>
<%-- <tr><td>Enter your Name </td><td><html:text property="username"/></td></tr>
<tr><td>Enter your Password </td><td><html:text property="password"/></td></tr>
<tr><td><html:submit>Login</html:submit> 
--%>

<!-- Using bean message -->
<tr><td><bean:message key="employee.name"/> </td><td><html:text property="username"/></td></tr>
<tr><td><bean:message key="employee.password"/> </td><td><html:text property="password"/></td></tr>
<tr><td><html:submit><bean:message key="employee.login"/> </html:submit>
</table>
</html:form>
</body>
</html>