<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <% int number=Integer.parseInt(request.getParameter("n"));%> --%>
<table border="10">
<c:forEach var="i" begin=1 end=10>
item <c:out value="${i}"/> <p>
<%-- <c:if test="${i%2==0}">
<c:out value="${i}"></c:out>

</c:if>  --%>
</c:forEach>
</table>
</body>
</html>