package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.Employee;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
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
		PrintWriter out=response.getWriter();
		String name=request.getParameter("n1");
		String password=request.getParameter("p1");
		Employee emp=new Employee();
		emp.setUsername(name);
		emp.setPassword(password);
//		if(emp.validate()){
//			out.write("Successful Login");
//		}else {
//			out.write("Login failure");
//		}
		if(emp.validate()) {
			RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
			dispatcher.forward(request, response);
		}else {
		    out.write("<p style='color:red;font-size:40px'>either the username or password is incorrect</p>");
			RequestDispatcher dispatcher=request.getRequestDispatcher("NewFile.html");
			dispatcher.include(request, response);
		}
	//	response.getWriter().print("<h3>hello master develper</h3>");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
