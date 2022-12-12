package com.java.model;

public class Employee {
private String uname;
private String password;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Employee [uname=" + uname + ", password=" + password + "]";
}
public boolean validate() {
	if(password.equals("123")) {
		return true;
	}else {
	return false;
	}
}
}

