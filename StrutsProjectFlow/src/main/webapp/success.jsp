<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
    <%@ page import="com.java.form.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- welcome to struts -->
<%-- <%
Employee e1=(Employee)request.getAttribute("employee");
request.setAttribute("employee", e1);
%>
welcome to struts
${employee.id }</br>
${employee.name }</br>
${employee.email }</br>
${employee.mobile }</br>
${employee.hobbies }</br> --%>

<%-- Logic for textfile upload
for file uploading// this is success file  
${data} --%>

this is success file
    
    <%
        String base64Encoded=(String)request.getAttribute("data");
    %>
    <img src="data:image/jpeg;base64,<%=base64Encoded%>"   width="200" height="300"/>
</body>
</html>