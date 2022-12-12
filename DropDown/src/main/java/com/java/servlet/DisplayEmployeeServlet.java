package com.java.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.employee.EmployeeDao;
import com.java.modern.Employee;

/**
 * Servlet implementation class DisplayEmployeeServlet
 */
@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         Employee emp=new Employee();
         emp.setName(request.getParameter("name"));
         emp.setAge(request.getParameter("age"));
         emp.setId(request.getParameter("id"));
         emp.setEmail(request.getParameter("email"));
         emp.setMobile(request.getParameter("mobile"));
			System.out.println(emp);

         try {
        	 EmployeeDao.insertEmployee(emp);
        	 System.out.println(emp);
 			
 		} catch (Exception e1) {
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
         response.getWriter().write("<h3>Data Successfully Inserted</h3>");
	}

}
