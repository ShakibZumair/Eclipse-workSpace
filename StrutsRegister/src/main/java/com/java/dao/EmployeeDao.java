package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.java.form.Employee;

public class EmployeeDao{
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	 Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","zumair");
		return con;
	}
	public static int insertEmployee(Employee emp)throws Exception {
		Connection conn=EmployeeDao.getConnection();
		PreparedStatement pst=conn.prepareStatement("insert into employee(name,age,email,mobile)values(?,?,?,?)");
		pst.setString(1,emp.getName());
		pst.setString(3,emp.getEmail());
		pst.setString(2,emp.getAge());
		pst.setString(4,emp.getMobile());
		int a=pst.executeUpdate();
	    conn.close();
		return a;
}
}