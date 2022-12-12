package com.java.color;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayColor
 */
@WebServlet("/DisplayColor")
public class DisplayColor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayColor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		HttpSession session=request.getSession();
		String color1=(String) session.getAttribute("color1");
		String color2=(String) session.getAttribute("color2");
		String color3=(String) session.getAttribute("color3");
         if(color1.toLowerCase().trim().equals("grey")) {
     		response.getWriter().print("<body style='background-color:grey'>");
         }else if(color2.toLowerCase().trim().equals("green")){
      		response.getWriter().print("<body style='background-color:green;'>");
 
         }else if (color3.toLowerCase().trim().equals("black")) {
        	 response.getWriter().print("<body style='background-color:black;'>");
         }else {
        	 response.getWriter().print("<p style='color:red;font-size:20px'>Please enter valid Color</p>");
         }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
