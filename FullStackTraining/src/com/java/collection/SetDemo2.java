package com.java.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*for Hash set program*/
//class Employee{
//	int id;
//	String name;
//	
//	
//	public Employee(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + "]";
//	}
//	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return Objects.hash();
//	}
//	@Override
//	public boolean equals(Object obj) {
//		// TODO Auto-generated method stub
//		Employee emp=(Employee)obj;
//		if(emp.getId()==this.getId() && emp.getName().equals(this.name)) {
//			return true;
//		}
//		else {
//			return false;
//		}
//			
//		}
//		
//	}
	
class Employee implements Comparable<Employee>{
	int id;
	String name;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)obj;
		if(emp.getId()==this.getId() && emp.getName().equals(this.name)) {
			return true;
		}
		else {
			return false;
		}
			
		}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
		
	}



public class SetDemo2 {
static String physics;
static String chemestry;

public static void main(String[] args) {
	
	
	
	
	//First program

//	Set<String> chemestry=new HashSet<String>();
//	chemestry.add("amit");chemestry.add("neha");chemestry.add("vishal");
//	Set<String> physics=new HashSet<String>();
//	physics.add("amit");physics.add("neha");physics.add("nidhi");
//	physics.removeAll(chemestry);
//	System.out.println("number who is study only physics "+physics.size());
//}
	
	/*//Second program to check how many obj is created 
	after override equal method nd hashcode we can ren programm*/
//	Set<Employee> emp=new HashSet<Employee>();
//	emp.add(new Employee(1,"amit"));
//	emp.add(new Employee(2,"ajay"));emp.add(new Employee(3,"vijay"));emp.add(new Employee(1,"amit"));
//	System.out.println(emp.size());
//    System.out.println(emp); }
	
	/*Using tree set we can check */
          Set<Employee> emp=new TreeSet<Employee>();                                                        
        emp.add(new Employee(1,"amit"));                                                                  
          emp.add(new Employee(2,"ajay"));emp.add(new Employee(3,"vijay"));emp.add(new Employee(1,"amit")); 
          System.out.println(emp.size());                                                                   
          System.out.println(emp); 
          }
}                                                                        