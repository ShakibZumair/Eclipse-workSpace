package com.java.action;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.dao.EmployeeDao;
import com.java.form.Employee;

public class EmployeeAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Employee e1=(Employee)form;
		e1.setName(request.getParameter("name"));
		e1.setAge(request.getParameter("age"));
		e1.setEmail(request.getParameter("email"));
		e1.setMobile(request.getParameter("mobile"));
         EmployeeDao.insertEmployee(e1);
         System.out.println(e1);
         return mapping.findForward("EmployeeDao");   
	}

}
