<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Successfully Login</h1>
<div style="color:red">
    	<html:errors />
    </div>
    <html:form action="/Login" >
        User Name :<html:text name="LoginForm" property="userName" />
        Password  :<html:password name="LoginForm" property="password" />
        <html:submit value="Login" />
    </html:form>
</body>
</html>