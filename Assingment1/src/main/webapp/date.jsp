<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <%
         Date date = new Date();
/*          out.print( "<h2 align = \"center\">" +date.toString()+"</h2>");
 */       
 out.print("<h2>"+date+"</h2>");
      %>
     <%= new Date() %>
</body>
</html>