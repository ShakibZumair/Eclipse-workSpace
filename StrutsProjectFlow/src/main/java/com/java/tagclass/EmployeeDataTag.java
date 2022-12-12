package com.java.tagclass;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.java.dao.Employee2Dao;
import com.java.form.Employee2;

public class EmployeeDataTag extends TagSupport{
	private static final long serialVersionUID = 1L;
	private int id;  
	      
	public void setId(int id) {  
		this.id = id; 
	}
	public int doStartTag()throws JspException{
	    Employee2 e1=null;
	    try {
	    	e1=Employee2Dao.getEmployeeById(id);
	    		
	    	}catch(Exception e2) {
	    		e2.printStackTrace();
	    	}
	    	 JspWriter out=pageContext.getOut();
	    	 try {
	    		 out.write("<table border='1'>");
	    		 out.write("<tr>");
	    		 out.write("<td>Id</td><td>name</td><td>Email</td><td>mobile</td><td>age</td>");
	    		 out.write("<td>"+e1.getId()+"</td><td>"+e1.getName()+"</td><td>"+e1.getAge()+"</td><td>"+e1.getEmail()+"</td><td>"+e1.getMobile()+"</td>");
	    	 out.write("</tr>");
	    	 out.write("</table>");
	    	 }catch(Exception e) {e.printStackTrace();}
	
 
	      
	    return SKIP_BODY;  
	}  
}
