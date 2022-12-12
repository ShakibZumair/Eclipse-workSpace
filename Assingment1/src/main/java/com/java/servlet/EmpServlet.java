package com.java.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.java.employee.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		String name=request.getParameter("n");
		String age=request.getParameter("a");
		String id=request.getParameter("i");
		String salary=request.getParameter("s");
		HttpSession session=request.getSession();
		session.setAttribute(name, session);
        
		Employee emp=new Employee(name, age, id, salary);
		if(emp.getEmployeeList().isEmpty()) {
			response.getWriter().print("List is empty");
		}else
		response.getWriter().print(emp.getEmployeeList());
//		if(emp.getEmployeeList() != null) {
//			RequestDispatcher dispatcher=request.getRequestDispatcher("Success.html");
//			dispatcher.forward(request, response);
//		}
//		}else {
//		    out.write("<p style='color:red;font-size:40px'>either the username or password is incorrect</p>");
//			RequestDispatcher dispatcher=request.getRequestDispatcher("NewFile.html");
//			dispatcher.include(request, response);
//		}

	    
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
