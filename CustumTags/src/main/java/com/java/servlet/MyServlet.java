package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.Employee;

import java.util.*;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Zumair", 7, "zumair@gmail.com", "98888999999", 27));
		employees.add(new Employee("Shakib", 54, "shakib@gmail.com", "99884453333", 52));
		employees.add(new Employee("Ajay", 2, "ajay@gmail.com", "7854399999", 47));
		employees.add(new Employee("Rohan", 8, "rohan@gmail.com", "8889999999", 28));
		request.setAttribute("employees", employees);
	
		request.getRequestDispatcher("display.jsp").include(request, response);
		System.out.println(employees);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
