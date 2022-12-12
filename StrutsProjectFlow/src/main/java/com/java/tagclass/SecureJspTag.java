package com.java.tagclass;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import org.apache.struts.config.ModuleConfig;



/**
*
* @author HP
*/
public class SecureJspTag extends TagSupport {



   private String name = "USERNAME";
    private String page = "/logon.jsp";



   public String getName() {
        return name;
    }



   public void setName(String name) {
        this.name = name;
    }



   public String getPage() {
        return page;
    }



   public void setPage(String page) {
        this.page = page;
    }



   @Override
    public int doEndTag() throws JspException {
        boolean valid = false;
        System.out.print("hello master developer");
        HttpSession session = pageContext.getSession();
        if ((session != null) && (session.getAttribute(name) != null)) {
            valid = true;
        }
        if(valid){
            return EVAL_PAGE;
        }else{
            
            ModuleConfig config=(ModuleConfig)pageContext.getServletContext().getAttribute(org.apache.struts.Globals.MODULE_KEY);
            try{
                pageContext.forward(config.getPrefix()+page);
            }catch(ServletException ex){
                throw new JspException(ex.toString());
            }catch(IOException ex){
                throw new JspException(ex.toString());
            }
            return SKIP_PAGE;
              
        }
    }



   @Override
    public int doStartTag() throws JspException {
        return SKIP_BODY;
    }



   @Override
    public void release() {
        super.release();
        this.name=name;
        this.page="./logon.jsp";
    }
    
    



}
