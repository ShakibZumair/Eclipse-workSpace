package com.jwt.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegisterDAO {
public void insertdata (String firstName ,String lastName ,String userName,String password ,String email ,String phone) throws Exception {
	System.out.println("jdbc connection");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root" ,"zumair");
	try {
		try {
			Statement st =con.createStatement();
			int value =st.executeUpdate("INSERT INTO USSER_DETAILS (FIRST_NAME ,LAST_NAME,USER_NAME,PASSWORD,EMAIL,PHONE)"
					+ "VALUES ('"+ firstName + "' ,'"+ lastName + "' ,'"+ userName + "' ,'"+ password + 
							 "','"+ email + "' ,'" + phone  +"')");
              System.out.println("1 row affected" + value);
		}catch(SQLException ex) {
			System.out.println("SQL statement is not executed!" +ex);
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
