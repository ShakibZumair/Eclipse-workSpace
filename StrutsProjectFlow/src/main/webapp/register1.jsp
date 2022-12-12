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
<%-- <html:form action="reg.do">
<table>
<tr><td>Enter ID </td><td><html:text property="id"/></td></tr>
<tr><td>Enter Name </td><td><html:text property="name"/></td></tr>
<tr><td>Enter Email </td><td><html:text property="email"/></td></tr>
<tr><td>Enter Mobile </td><td><html:text property="mobile"/></td></tr>
<tr>
cricket<html:checkbox value="Cricket" property="hobbies"/><br/>
football<html:checkbox value="Football" property="hobbies"/><br/>
Tennis<html:checkbox value="Tennis" property="hobbies"/><br/>
</tr>
<tr><td colspan="2"><input type ="submit" value="click Here" ></td></tr>
</table>
</html:form>
</body>
</html> --%>

<%-- <html:form action="reg.do">
<table>
<tr><td><bean:message key="employee.id"/> </td><td><html:text property="id"/></td></tr>
<tr><td><bean:message key="employee.name"/> </td><td><html:text property="name"/></td></tr>
<tr><td><bean:message key="employee.email"/> </td><td><html:text property="email"/></td></tr>
<tr><td><bean:message key="employee.mobile"/> </td><td><html:text property="mobile"/></td></tr>
<tr>
<bean:message key="employee.hobbies.cricket"/>cricket<html:checkbox value="Cricket" property="hobbies"/><br/>
<bean:message key="employee.hobbies.football"/>football<html:checkbox value="Football" property="hobbies"/><br/>
<bean:message key="employee.hobbies.tennis"/>Tennis<html:checkbox value="Tennis" property="hobbies"/><br/>
</tr>
<tr><td><html:submit><bean:message key="employee.submit"/></html:submit></td></tr>
</table>
</html:form>
</body>
</html> --%>


<%-- <html:form action="reg.do">
<table>
 <html:errors/> --%>

 <%-- <tr><td><bean:message key="employee.id"/> </td><td><html:text property="id"/></td></tr>
<tr><td><bean:message key="employee.name"/> </td><td><html:text property="name"/><p style="color:red; font-size:13px""><html:errors property="name"/></p></td></tr>
<tr><td><bean:message key="employee.email"/> </td><td><html:text property="email"/><p style="color:red; font-size:13px""><html:errors property="email"/></p></td></tr>
<tr><td><bean:message key="employee.mobile"/> </td><td><html:text property="mobile"/><p style="color:red; font-size:13px""><html:errors property="mobile"/></p></td></tr>
<tr><td><bean:message key="employee.age"/> </td><td><html:text property="age"/><p style="color:red; font-size:13px""><html:errors property="age"/></p></td></tr>
<tr><td><html:submit property="parameter"><bean:message key="emp.add"/></html:submit></td></tr>
 --%>
 <html:form action="reg.do">
<table>
 <html:errors/>
 <tr><td><bean:message key="employee.id"/> </td><td><html:text property="id"/></td></tr>
<tr><td><bean:message key="employee.name"/> </td><td><html:text property="name"/></td></tr>
<tr><td><bean:message key="employee.email"/> </td><td><html:text property="email"/></td></tr>
<tr><td><bean:message key="employee.mobile"/> </td><td><html:text property="mobile"/></p></td></tr>
<%-- <tr><td><bean:message key="employee.age"/> </td><td><html:text property="age"/></p></td></tr> --%>
 <td><bean:message key="employee.age"/></td>
 <td><html:text property="age"/></td>
<tr><td><html:submit property="parameter"><bean:message key="emp.add"/></html:submit></td></tr>



</table>
<a href="./changelang.do?language=en">English</a>
<a href="./changelang.do?language=hi">Hindi</a>
<!-- <link rel="English" href="./changelang.do?language=en">
<link rel="Hindi" href="./changelang.do?language=hi"> -->

</html:form>
</body>
</html>