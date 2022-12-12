package com.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import com.java.model.*;


public class EmployeeDao {
public static Connection getConnection() throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
 Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","zumair");
	return con;
}
public static int insertEmployee(Employee emp)throws Exception {
	Connection conn=EmployeeDao.getConnection();
	PreparedStatement pst=conn.prepareStatement("insert into employee(name,email,age,mobile)values(?,?,?,?)");
	pst.setString(1,emp.getName());
	pst.setString(2,emp.getEmail());
	pst.setInt(3,emp.getAge());
	pst.setString(4,emp.getMobile());
	int a=pst.executeUpdate();
    conn.close();
	return a;
	
}
public static List<Employee> getAllEmployee () throws Exception{
	List <Employee> emp=new ArrayList<Employee>();
	Connection conn=EmployeeDao.getConnection();
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery("select * from employee");
	while(rs.next()) {
		emp.add(new Employee(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5)));
		
	}
	conn.close();
	return emp;
	
}
public static int deleteEmployee(int id) throws Exception {
	Connection conn=EmployeeDao.getConnection();
	PreparedStatement pst=conn.prepareStatement("delete from employee where id=?");
	int a=pst.executeUpdate();
	pst.setInt(1, id);
	conn.close();
	return a;
	
}
public static int updateEmployee(Employee emp) throws Exception{
	Connection conn=EmployeeDao.getConnection();
	PreparedStatement pst=conn.prepareStatement("update employee set name=?,email=?,age=?,mobile=? where id=?");
	pst.setString(1,emp.getName());
	pst.setString(2,emp.getEmail());
	pst.setInt(3,emp.getAge());
	pst.setString(4,emp.getMobile());
	pst.setInt(5,emp.getId());

	int a=pst.executeUpdate();
    conn.close();
	return a;
	
}

//public static Employee getEmployee(int id) throws Exception{
//	Connection conn=EmployeeDao.getConnection();
//	PreparedStatement pst=conn.prepareStatement("select * from employee where id=?");
//	pst.setInt(1, id);
//	int rs=pst.executeUpdate();
//	return rs;
//	
//}
}
