<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.java.model.Employee"></jsp:useBean>
<%-- <jsp:setProperty property="*" name="emp" /> --%>

<jsp:setProperty property="id" name="emp" value="7"/>
<jsp:setProperty property="name" name="emp" value="zumair"/>
<jsp:setProperty property="email" name="emp" value="zumair@gmail.com"/>
<jsp:setProperty property="age" name="emp" value="27"/>
<jsp:setProperty property="mobile" name="emp" value="938839947"/>

<jsp.getProperty property="id" name="emp"/><br/>
<jsp.getProperty property="name" name="emp"/><br/>
<jsp.getProperty property="email name="emp"/><br/>
<jsp.getProperty property="age" name="emp"/><br/>
<jsp.getProperty property="mobile" name="emp"/><br/>


</body>
</html>