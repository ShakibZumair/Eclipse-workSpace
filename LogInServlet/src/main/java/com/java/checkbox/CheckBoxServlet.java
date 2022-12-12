package com.java.checkbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckBoxServlet
 */
@WebServlet("/CheckBoxServlet")
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBoxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.setContentType("text/html");
//		HttpSession session=request.getSession();
//		String name=(String) session.getAttribute("Name");
//		String age=(String) session.getAttribute("Age");
//		//String hobbies=(String) session.getAttribute("Hobbies");
//   
//    	   response.getWriter().print("crciket");
		PrintWriter pw=res.getWriter();
        res.setContentType("text/html");

        String[] values=req.getParameterValues("habits");
        pw.println("Selected Values...");    
        for(int i=0;i<values.length;i++)
       {
           pw.println("<li>"+values[i]+"</li>");
       }
       pw.close();
   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
