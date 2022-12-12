package com.java.checkbox;

public class Employee {
private String name;
private String hobbies;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", hobbies=" + hobbies + ", age=" + age + "]";
}


}
