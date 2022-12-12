package com.java.exception.handler;






import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.action.ExceptionHandler;
import org.apache.struts.config.ExceptionConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.java.exception.AgeInvalide;

public class AgeInvalideHandler extends ExceptionHandler{
//	First Program
//	private static final Logger logger=LoggerFactory.getLogger(AgeInvalide.class);
//
//	@Override
//	public ActionForward execute(Exception ex, ExceptionConfig ae, ActionMapping mapping, ActionForm formInstance,
//			HttpServletRequest request, HttpServletResponse response) throws ServletException {
//		// TODO Auto-generated method stub
//		logger.error(ex.getMessage());
//		return super.execute(ex, ae, mapping, formInstance, request, response);
//	}
	private static final Logger logger=LoggerFactory.getLogger(AgeInvalide.class);

	@Override
	public ActionForward execute(Exception ex, ExceptionConfig ae, ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO Auto-generated method stub
		ActionMessages messages=new ActionMessages();
		messages.add("P1",new ActionMessage("error.age.invalide"));
		messages.add("P2",new ActionMessage("error.data.invalide"));
		request.setAttribute("messages", messages);
		logger.error(ex.getMessage());
		return super.execute(ex, ae, mapping, formInstance, request, response);
	}

}
