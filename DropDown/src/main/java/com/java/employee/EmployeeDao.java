package com.java.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class EmployeeDao {

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
	 Connection	conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","zumair");
		return conn;
	}
	public static int insertEmployee(com.java.modern.Employee emp)throws Exception {
		Connection conn=EmployeeDao.getConnection();
		PreparedStatement pst=conn.prepareStatement("insert into employee(name,email,age,mobile)values(?,?,?,?)");
		pst.setString(1,emp.getName());
		pst.setString(2,emp.getEmail());
		pst.setString(3,emp.getAge());
		pst.setString(4,emp.getMobile());
		int a=pst.executeUpdate();
	    conn.close();
		return a;
}
}