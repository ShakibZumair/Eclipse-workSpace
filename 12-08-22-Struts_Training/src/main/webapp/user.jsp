
<%@ page language="java" contentType="text/html; charset=UTF-8"
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

<html:form action="f.do" method="post" enctype="multipart/form-data">
   Enter name<html:text property="username" />    
   Upload file<html:file property="file"></html:file><br/>
   <html:submit value="Upload" />
</html:form>


</body>

</html>