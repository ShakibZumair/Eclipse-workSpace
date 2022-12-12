package com.java.model;

public class Employee {
private String name;
private int id;
private String email;
private String mobile;
private int age;

public Employee() {
	
}


public String getName() {
	return name;
}

public Employee(String name, int id, String email, String mobile, int age) {
	super();
	this.name = name;
	this.id = id;
	this.email = email;
	this.mobile = mobile;
	this.age = age;
}


public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}


@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", mobile=" + mobile + ", age=" + age + "]";
}


}
