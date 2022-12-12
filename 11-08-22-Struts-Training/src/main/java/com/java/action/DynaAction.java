package com.java.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;

public class DynaAction extends Action{
private static final String SUCCESS="success";
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DynaActionForm d1=(DynaActionForm)form;
		String username=d1.getString("username").toString();
		String password=d1.getString("password").toString();
		System.out.println(username+"  "+password);
		return mapping.findForward(SUCCESS);
	}

}
