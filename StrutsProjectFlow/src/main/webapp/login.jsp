<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%--   
<%@page contentType="text/html"%>
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
<html:form action="peg.do">
enter username<html:text property="username"/>
enter password<html:text property="password"/>
<html:submit>Login</html:submit>
</html:form>
</body>
</html>