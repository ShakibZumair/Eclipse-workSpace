<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.* ,com.java.model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<Employee> employees = (List<Employee>) request.getAttribute("employees");
	request.setAttribute("employees", employees);
	%>
	<table border="1" width="50% " align="center">
		<tr>
			<th>S.No</th>
			<th>Name</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Edit</th>
			<th>Delete</th>

		</tr>
		<c:forEach items="${employees}" var="emp">
			<%-- <c:if test="${emp.age>=30 }"> --%>
			<tr>
				<td><c:out value="${emp.name}" /></td>
				<td><c:out value="${emp.id}" /></td>
				<td><c:out value="${emp.email}" /></td>
				<td><c:out value="${emp.mobile}" /></td>
				<td><c:out value="${emp.age}" /></td>
				<td><input type="submit" value="Edit"></td>
				<td><input type="submit" value="Delete"></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>