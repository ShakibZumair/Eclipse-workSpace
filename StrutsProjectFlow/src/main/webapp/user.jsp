<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>



<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:form action="file-upload.do" method="post" enctype="multipart/form-data">
   Enter name<html:text property="username" />    
   Upload file<html:file property="file"></html:file><br/>
   <html:submit value="Upload" />
</html:form>