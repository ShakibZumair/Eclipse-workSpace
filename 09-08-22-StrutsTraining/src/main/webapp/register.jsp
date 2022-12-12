<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- <body>
First Program
	<form action="r.do">
		<table>
			<tr>
				<td>Enter your Id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Enter your name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter your mobile</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Enter your email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Click here" /></td>
			</tr>

		</table> -->
<!-- <body>
First program contine same second program
	<form action="r.do">
		<table>
		
			<tr>
				<td>Enter your Id</td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Enter your name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Enter your mobile</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>Enter your email</td>
				<td><input type="text" name="email"></td>
			</tr>

		</table>

		<tr>
			<tb>Cricket <input type="checkbox" value="Cricket"
				name="hobbies" /> </br>
			<tr>
				<tb>Football <input type="checkbox" value="Football"
					name="hobbies" /> </br>
				<tr>
					<tb>Hockey <input type="checkbox" value="Hockey"
						name="hobbies" /> </br>
					</tb>
				</tr>
				</br>
				<tr>
					<td colspan="2"><input type="submit" value="Click here" /></td>
				</tr>
			
				
	</form>
</body> -->
<%-- <body>
Third program
	<html:form action="r.do">
		<table>

			<tr>
				<td>Enter your Id</td>
				<td><html:text property="id" /></td>
			</tr>

			<tr>
				<td>Enter your name</td>
				<td><html:text property="name" /></td>
			</tr>
			<tr>
				<td>Enter your email</td>
				<td><html:text property="email" /></td>
			</tr>
			<tr>
				<td>Enter your mobile</td>
				<td><html:text property="mobile" /></td>
			</tr>
		</table>

		<tr>
			<td>Cricket <html:checkbox value="Cricket" property="hobbies" />
				</br>
			<td>Football <html:checkbox value="Football" property="hobbies" />
				</br>
			<td>Hockey <html:checkbox value="Hockey" property="hobbies" />
				</br> </br>
		<tr>
			<td><html:submit value="Click here" /></td>
		</tr>


	</html:form>
</body> --%>


<!-- Below code refer same as fourth ,Fifth And Assignment of printing value on client site
As per user request
 -->
<body>
	<html:form action="r.do">
		<table>

			<tr>
				<td><bean:message key="employee.id"/></td>
				<td><html:text property="id" /></td>
			</tr>

			<tr>
				<td><bean:message key="employee.name"/></td>
				<td><html:text property="name" /></td>
			</tr>
			<tr>
				<td><bean:message key="employee.email"/></td>
				<td><html:text property="email" /></td>
			</tr>
			<tr>
				<td><bean:message key="employee.mobile"/></td>
				<td><html:text property="mobile" /></td>
			</tr>
		</table>

		<tr>
			<td><bean:message key="employee.hobbies.cricket"/><html:checkbox value="Cricket" property="hobbies" />
				</br>
			<td><bean:message key="employee.hobbies.football"/><html:checkbox value="Football" property="hobbies" />
				</br>
			<td><bean:message key="employee.hobbies.hockey"/> <html:checkbox value="Hockey" property="hobbies" />
				</br> </br>
		<tr>
			<td><html:submit><bean:message key="employee.submit"/></html:submit></td>
		</tr>


	</html:form>
</body>
</html>