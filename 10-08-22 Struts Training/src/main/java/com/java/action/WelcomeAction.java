package com.java.action;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.form.Employee;

public class WelcomeAction extends Action {
	private static final String SUCCESS = "success";



//First Program
//	@Override
//	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		return mapping.findForward(SUCCESS);
//	}
	
	
//	/* Second program */
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(23, "Zumair", "749029383", "zumair@gamil.com"));
		emp.add(new Employee(12, "Sunam", "788333383", "sunam@gamil.com"));
		emp.add(new Employee(01, "Ajay", "990088383", "ajay@gamil.com"));
		emp.add(new Employee(43, "Shakib", "888855483", "shakib@gamil.com"));
		request.setAttribute("employee", emp);
		return mapping.findForward(SUCCESS);
	}
	

	
}
