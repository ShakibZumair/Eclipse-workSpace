package com.java.form;

import org.apache.struts.action.ActionForm;

public class Employee extends ActionForm{
private String name;
private String id;
private String Age;
private String email;
private String mobile;

public Employee() {
	
}

public Employee(String name, String id, String age, String email, String mobile) {
	super();
	this.name = name;
	this.id = id;
	Age = age;
	this.email = email;
	this.mobile = mobile;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getAge() {
	return Age;
}

public void setAge(String age) {
	Age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", Age=" + Age + ", email=" + email + ", mobile=" + mobile + "]";
}

}
