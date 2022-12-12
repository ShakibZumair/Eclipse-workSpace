package com.java.model;

import java.util.regex.Pattern;

public class Employee {
//private int salary;
private String name;
private String department;
private int id;
private String email;
//private int age;
//public int getSalary() {
//	return salary;
//}
//public void setSalary(int salary) {
//	this.salary = salary;
//}
public Employee(){
	
}

public Employee(String name, String department, int id, String email) {
	super();
	this.name = name;
	this.department = department;
	this.id = id;
	this.email = email;
}

public String getName() {
	return name;
}
public void setName(String name) {
	if (name.equals("pagal"))
	this.name="";
	else
		this.name=name;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
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
public void setEmail(String email) throws EmailNotValidException {
	String regex="^[A-Za-z0-9+_.-]+@(.+)$";
			Pattern pattern = Pattern.compile(regex);
	if (!pattern.matcher(email).matches())
		throw new EmailNotValidException("This Email format is not Valid");
	this.email = email;
	

}
//public int getAge() {
//	return age;
//}
//public void setAge(int age) {
//	if (age>=21 || age>=26) {
//		this.age=0;
//	}else
//		this.age=age;
//	this.age = age;
//}
@Override
public String toString() {
	return "Employee [ name=" + name + ", department=" + department + ", id=" + id + ", email="
			+ email + "]";
}

}
