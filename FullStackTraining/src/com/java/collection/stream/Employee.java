package com.java.collection.stream;

public class Employee {
private int id;
private String name;
private int age;
private String email;
private String department;
public Employee(){
	
}
public Employee(int id, String name, int age, String email,String department) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.email = email;
	this.department=department;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
}

}
