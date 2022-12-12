<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int num=Integer.parseInt(request.getParameter("n1"));
%>
<table border="1">
<% 
for(int i=1 ;i<=10;i++){
	if (i%2==0){
%>

		<tr><td><%= num %></td><td>*</td><td><%= i %></td><td>=</td><td><%=num*i %></td></tr>		
	<% }else{%>
	
	<tr style="background-color:grey"><td><%= num %></td><td>*</td><td><%= i %></td><td>=</td><td><%=num*i %></td></tr>
<% } }%>


</table>


</body>
</html>