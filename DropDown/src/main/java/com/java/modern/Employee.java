package com.java.modern;

public class Employee {
private String id;
private String name;
private String email;
private String age;
private String mobile;

public Employee(){
	
}

public Employee(String id, String name, String email, String age, String mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.age = age;
	this.mobile = mobile;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

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

public String getAge() {
	return age;
}

public void setAge(String age) {
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
	return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", mobile=" + mobile + "]";
}


}
