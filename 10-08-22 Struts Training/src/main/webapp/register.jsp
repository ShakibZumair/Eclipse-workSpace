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
<!-- Same Progrma For First ,Second, Third  -->
<body>
<html:form action="reg.do">
<table>
<tr><td><bean:message key="employee.id"/> </td><td><html:text property="id"/></td></tr>
<tr><td><bean:message key="employee.name"/> </td><td><html:text property="name"/></td></tr>
<tr><td><bean:message key="employee.email"/> </td><td><html:text property="email"/></td></tr>
<tr><td><bean:message key="employee.mobile"/> </td><td><html:text property="mobile"/></td></tr>

<tr><td><html:submit property="parameter"><bean:message key="employee.add"/></html:submit></td></tr>
<tr><td><html:submit property="parameter"><bean:message key="employee.update"/></html:submit></td></tr>



</table>
</html:form>
</body>

</html>