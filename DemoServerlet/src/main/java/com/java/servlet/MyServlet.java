package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet(
		urlPatterns = { "/MyServlet" }, 
		initParams = { 
				@WebInitParam(name = "name", value = "zumair"), 
				@WebInitParam(name = "email", value = "zumair@gmail.com")
		})
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.getWriter().print("<h3>hello master develper</h3>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	//	RequestDispatchar dispatcher=request.getRequestDispatcher("success.html");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	//	String uname =request.getParameter
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, ServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
