package com.java.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import com.java.form.User;

public class FileUploadAction   extends Action{



   @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        User u1 =(User)form;
        FormFile f=u1.getFile();
        int i=0;
        String s1="";
        
        ByteArrayInputStream fin=(ByteArrayInputStream)f.getInputStream();
        while((i=fin.read())!=-1) {
            s1+=(char)i;
        }
        request.setAttribute("data", s1);
        return mapping.findForward("success");
    }
//	@Override
//    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
//            HttpServletResponse response) throws Exception {
//        User u1 =(User)form;
//        FormFile f=u1.getFile(); 
//        int i=0;
//        String s1="";
//        
//        ByteArrayInputStream fin=(ByteArrayInputStream)f.getInputStream();
//        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//        byte[] buf = new byte[1024];
//        try {
//            for (int readNum; (readNum = fin.read(buf)) != -1;) {
//                //Writes to this byte array output stream
//                bos.write(buf, 0, readNum);
//                System.out.println("read " + readNum + " bytes,");
//            }
//        } catch (IOException ex) {
//           // Logger.getLogger(ConvertImage.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//
//
//       byte[] bytes = bos.toByteArray();
//
//
//
//       byte[] encodeBase64 = Base64.getEncoder().encode(bytes);
//        String base64Encoded = new String(encodeBase64, "UTF-8");
//        request.setAttribute("data", base64Encoded);
//        return mapping.findForward("success");
//    }
}