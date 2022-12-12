package com.java.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;

import com.java.form.Employee;

//public class NewEmployeeAction  extends DispatchAction {
//	
//	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("add called");
//		return mapping.findForward("success");   
//	}
//	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("update called");
//		return mapping.findForward("success");   
//	}
public class NewEmployeeAction  extends LookupDispatchAction {
	
	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("add called");
		return mapping.findForward("success");   
	}
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("update called");
		return mapping.findForward("success");   
	}
	@Override
	protected Map getKeyMethodMap() {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("employee.add", "add");
		map.put("employee.update", "update");
		return map;
	}
	
}
