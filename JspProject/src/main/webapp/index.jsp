<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
List <String> arr=new ArrayList<String>();
arr.add("zumair");arr.add("vishal");arr.add("Shakib");
request.setAttribute("arr",arr);
%>
<c:set> var="msg" value="The Example of JSTL fn:startswith()"</c:set>
<%-- <c:set var="name" value="zumair"/>
<c:out value="${name }"/> --%>


<%-- <c:set var="value" value="82"/>
<c:if test="${value>5}">
<c:out value="${value}"></c:out>
</c:if> --%>


<%-- <c:set var="Age" value="2"/>
<c:if test="${Age>18}"></c:if>
<p>You are Eligable for vote: <c:out value="${Age }"></c:out> --%>
</body>
</html>

