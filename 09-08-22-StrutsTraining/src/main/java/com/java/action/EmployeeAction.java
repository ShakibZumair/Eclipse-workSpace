package com.java.action;

import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.form.Employee;

public class EmployeeAction extends Action {

//	@Override
//	First Program
//	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		Employee e=(Employee)form;
//		System.out.println(e);
//		request.setAttribute("emp", e);
//		return mapping.findForward("success");
//	}
	
//	@Override
//	First Program continue with print value of hobbies on console  
//	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//	Employee e=(Employee)form;
//	Arrays.asList(e.getHobbies()).stream().forEach(em->System.out.println(em));

//		return mapping.findForward("success");
//	}
//	@Override
	//same for 3 4 and fifth program

//	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//	return mapping.findForward("success");
//	}
	
	//Assigments for printing hobbies on client site which one user select
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	PrintWriter pw=response.getWriter();
    response.setContentType("text/html");

    String[] values=request.getParameterValues("hobbies");
    pw.println("Selected Values...");    
    for(int i=0;i<values.length;i++)
   {
       pw.println("<li>"+values[i]+"</li>");
   }
   pw.close();
	

	return mapping.findForward("success");
	}
	

}
