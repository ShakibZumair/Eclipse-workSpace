package com.java.action;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.LookupDispatchAction;


public class EmployeeAction extends LookupDispatchAction{
private static final String SUCCESS="success";
/* <First Progarm simple mapping using Actin class> */
/* <Second Program using DispatchAxtion> */
//public class EmployeeAction extends DispatchAction{
//	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//			HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Add Called");
//		return mapping.findForward(SUCCESS);
//	}
//public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//HttpServletResponse response) throws Exception {
//// TODO Auto-generated method stub
//System.out.println("Update called");
//return mapping.findForward(SUCCESS);
//}


/* Third program using LookupDispatchAction */
	//public class EmployeeAction extends LookupDispatchAction{

	public ActionForward add(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Add Called");
		return mapping.findForward(SUCCESS);
	}
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("update Called");
		return mapping.findForward(SUCCESS);
	}

@Override
protected Map getKeyMethodMap() {
Map<String,String> m1=new HashMap<String,String>();
m1.put("employee.add", "add");
m1.put("employee.update", "update");
	return m1;
}	
	

}
