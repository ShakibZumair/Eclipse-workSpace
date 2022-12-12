<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ page import="com.java.form.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<%
second program printing value
	Employee e1 = (Employee) request.getAttribute("emp");
	%> --%>
	
	<!-- 
	Common healdline for al program checking application 
	<h1>You are successfuly enter in struts.</h1> -->
	<%-- 
	First Program getting value of variable
		${ emp.id }
	</br> ${ emp.name}
	</br> ${ emp.email }
	</br> ${ emp.mobile} --%>

<%-- 
Fifth program writing code with calling throw bean object
<bean:write name="RF" property="id"></bean:write></br>
<bean:write name="RF" property="name"></bean:write></br>
<bean:write name="RF" property="email"></bean:write></br>
<bean:write name="RF" property="mobile"></bean:write></br>
<bean:write name="RF" property="hobbies"></bean:write></br>
 --%>
</body>
</html>