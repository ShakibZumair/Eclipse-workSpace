package com.java.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {
private static Employee e;	
private static String name;
private static String salary;
private static String id;
private static String age;

public Employee(String name, String age, String salary, String id) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", id=" + id + "]";

	
}
public List getEmployeeList() {

	List <Employee> list=Arrays.asList(new Employee("Shakib", "27", "22000", "77"),
			new Employee("Zumair", "28", "32000", "27"),new Employee("Vicky", "43", "89000", "97"),
			new Employee("Ajay", "27", "43000", "39"),new Employee("Rina", "32", "32000", "328"));
	

	
//	if(list.equals(list)) {
//		System.out.println(list);
//	}

	return list;
	
	
    
}
	
}

