package com.java.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class SecureAction extends Action{
  private static final String USERNAME="username";
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute(USERNAME);
		if(name==null || name.length()==0)
		return mapping.findForward("logon");
		return doExecute(mapping,form,request,response);
		
	}
public abstract ActionForward doExecute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response);
}