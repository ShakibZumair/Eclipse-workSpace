<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-html" prefix="html" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset=ISO-8859-1>
<title>Login page</title>
</head>
<body bgcolor="silver">
<br></br>
<body> 
<html:html> </html:html>
  <div style="color:red">
  <html:errors />
  </div>
  <html :form action ="/register " method= "get">
  Enter your First Name:
  <html : text property="firstname " size="50" /> <br> <br>
  Enter your Last Name:
  <html : text property="lastname " size="50" /> <br> <br>
  Enter your username:
  <html : text property="username " size="50" /> <br> <br>
  Enter your password:
  <html : text property="password " size="50" /> <br> <br>
  Enter your Email:
  <html : text property="Email " size="50" /> <br> <br>
  Enter your Phone No:
  <html : text property="phone  " size="50" /> <br> <br>
  <html : submit> Submit </html:submit>
  <br> <br>
  </html :form>
</body>
</html>