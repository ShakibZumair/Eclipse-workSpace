package com.java.form;

import org.apache.struts.action.ActionForm;

public class Employee extends ActionForm {
	//First Program 
//private int id;
//private String name;
//private String mobile;
//private String email;

//public Employee () {
//	
//}
//
//public Employee(int id, String name, String mobile, String email) {
//	super();
//	this.id = id;
//	this.name = name;
//	this.mobile = mobile;
//	this.email = email;
//}
//
//public int getId() {
//	return id;
//}
//
//public void setId(int id) {
//	this.id = id;
//}
//
//public String getName() {
//	return name;
//}
//
//public void setName(String name) {
//	this.name = name;
//}
//
//public String getMobile() {
//	return mobile;
//}
//
//public void setMobile(String mobile) {
//	this.mobile = mobile;
//}
//
//public String getEmail() {
//	return email;
//}
//
//public void setEmail(String email) {
//	this.email = email;
//}
//
//
//
//@Override
//public String toString() {
//	return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email +"]";
//}
	private int id;
	private String name;
	private String mobile;
	private String email;
	public String parameter;
public Employee () {
	
}

public Employee(int id, String name, String mobile, String email) {
	super();
	this.id = id;
	this.name = name;
	this.mobile = mobile;
	this.email = email;

}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



public String getParameter() {
	return parameter;
}

public void setParameter(String parameter) {
	this.parameter = parameter;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", parameter="
			+ parameter + "]";
}

}
