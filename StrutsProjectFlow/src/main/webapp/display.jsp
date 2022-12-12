<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<logic:iterate id="employee" name="employee">



   <bean:write name="employee" property="name"/><br/>



   <bean:write name="employee" property="email"/><br/>



   <bean:write name="employee" property="mobile"/><br/>



  <html:link action="page3.do">
   go to page3
   </html:link>




</logic:iterate></body>
</html>