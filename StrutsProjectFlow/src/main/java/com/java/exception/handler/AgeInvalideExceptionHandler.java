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


public class AgeInvalideExceptionHandler extends ExceptionHandler{
private static final Logger logger=LoggerFactory.getLogger(AgeInvalideExceptionHandler.class);
	@Override
	public ActionForward execute(Exception ex, ExceptionConfig ae, ActionMapping mapping, ActionForm formInstance,
			HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO Auto-generated method stub
		ActionMessages messages=new ActionMessages();
		messages.add("p1",new ActionMessage("error.age.invalide"));
		messages.add("p1",new ActionMessage("error.data.reenter"));
		logger.error(ex.getMessage());
		return super.execute(ex, ae, mapping, formInstance, request, response);
	}

}
