package com.java.model;

import java.sql.Date;

public class PermanentEmployee extends Employee {
private int salary;
private Date doj;

public PermanentEmployee() {
	
}


public PermanentEmployee(String name, String department, int id, String email,int salary, Date doj) {
	super(name,department,id,email);
	
	this.salary = salary;
	this.doj = doj;
}


public PermanentEmployee(String name, String department, int id, String email,int salary) {
	this(name,department,id,email,salary,null);
	
}


public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Date getDoj() {
	return doj;
}
public void setDoj(Date doj) {
	this.doj = doj;
}

}
