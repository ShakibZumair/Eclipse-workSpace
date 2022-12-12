package com.java.form;

import java.util.Arrays;

import org.apache.struts.action.ActionForm;

public class Employee extends ActionForm {
private int id;
private String name;
private String mobile;
private String email;
private String [] hobbies;

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

public String[] getHobbies() {
	return hobbies;
}

public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", hobbies="
			+ Arrays.toString(hobbies) + "]";
}

}
