package com.java.form;

public class Employee2 {
private String name;
private String email;
private int id;
private int age;
private String mobile;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Employee2 [name=" + name + ", email=" + email + ", id=" + id + ", age=" + age + ", mobile=" + mobile + "]";
}

}
