package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.java.form.Employee;



	public class EmployeeDao {
		public static Connection getConnection() throws Exception {
			Class.forName("com.mysql.jdbc.Driver");
		 Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","zumair");
			return con;
		}
		public static int checkValide(Employee emp)throws Exception {
			Connection conn=EmployeeDao.getConnection();
//			PreparedStatement pst=conn.prepareStatement("select* from employee");
//			pst.setString(1,emp.getName());
//		    pst.setString(2,emp.getPassword());
//			int a=pst.executeUpdate();
//		    conn.close();
//			return a;
			    String query = "select * FROM employee";
			    try (Statement stmt = conn.createStatement()) {
			      ResultSet rs = stmt.executeQuery(query);
			      while (rs.next()) {
			        String name = rs.getString("NAME");
			        String password = rs.getString("PASSWORD");
			       
			        System.out.println(name + ", " +password);
			      }
			    } catch (Exception e) {
			    	System.out.println("Invalid Login");
			    }
				return 0;
			  }
		
}
	

	
	
	
	
	
	
	
	
	
	
	
	
	