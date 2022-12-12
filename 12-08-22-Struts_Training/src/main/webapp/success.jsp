<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
 <h1>welcome  to success page</h1>
 ${data}
</body>
<body>
  <%
        String base64Encoded=(String)request.getAttribute("data");
    %>
    <img src="data:image/jpeg;base64,<%=base64Encoded%>"   width="200" height="300"/>
    
    <br/>
</body>
</html> --%>
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>




<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    this is success file
    
    <%
        String base64Encoded=(String)request.getAttribute("data");
    %>
    <img src="data:image/jpg;base64,<%=base64Encoded%>"   width="200" height="300"/>
    
    <br/>
</body>
</html>