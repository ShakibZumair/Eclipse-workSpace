package com.java.action;

import java.util.Arrays;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.form.Employee;

public class WelcomeAction extends Action {

	private static final String SUCCESS="success";
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<Employee> employee = new ArrayList<Employee>();
        employee.add(new Employee( "Akshay","67" ,"akshay@gmail.com", "9112986157","Akshay123"));
        employee.add(new Employee("Zumair","97" ,"zumair@gmail.com", "99902986157","zumair123"));
        employee.add(new Employee("Shakib","897" ,"shakib@gmail.com", "89662986157","shakib123"));

        request.setAttribute("employee", employee);
		return mapping.findForward(SUCCESS);   
	}
}
