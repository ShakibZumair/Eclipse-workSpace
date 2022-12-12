<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page pageEncoding="UTF-8"%> --%>
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
this is error jsp
<html:messages id="psg" name="message">
<bean:write name="psg"/>
<div style="color:red,font-size:30px"><bean:write name="psg"/> <br/>
</html:messages>
</body>
</html>	