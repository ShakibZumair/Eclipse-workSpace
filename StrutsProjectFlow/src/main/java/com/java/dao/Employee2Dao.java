package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.java.form.Employee2;


public class Employee2Dao {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	 Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","zumair");
		return con;
	}
	
	public static Employee2 getEmployeeById(int id) throws Exception{
		Employee2 e2=null;
		Connection conn=Employee2Dao.getConnection();
		PreparedStatement ps=conn.prepareStatement("select * form employee where id=?");
		
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			e2=new Employee2();
			e2.setId(rs.getInt("id"));
			e2.setName(rs.getString("name"));
			e2.setAge(rs.getInt("age"));
			e2.setEmail(rs.getString("email"));
			e2.setMobile(rs.getString("mobile"));
		}
		return e2;
		
	}
}
