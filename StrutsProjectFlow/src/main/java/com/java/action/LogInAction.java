package com.java.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.java.dao.EmployeeDao;
import com.java.form.Employee;

public class LogInAction extends Action {
	private static final String EMPDAO="EmplyeeDao";
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		Employee employee=new Employee();
		EmployeeDao.checkValide(employee);
		
        request.setAttribute("employee", employee);
		return mapping.findForward( EMPDAO);   
	}
}

