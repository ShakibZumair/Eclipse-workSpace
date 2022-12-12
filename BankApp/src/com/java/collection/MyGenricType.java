package com.java.collection;

import java.util.Comparator;

class Student implements Comparable<Student> {
    
    int id;
    String name;
    int age;
    
   
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	
		@Override
	    public int compareTo(Student o) {
	        int nameVal=this.name.compareTo(o.name);
	        int ageVal=this.age-o.age;
	        
	        return nameVal==0?ageVal:nameVal;
	    }
	}
	
    
    




public class MyGenricType<T> {
    
    T a;
    T b;
    
    public MyGenricType(T a , T b) {
        this.a=a;
        this.b=b;
    }
     
    public boolean isValueEqual()  {
        return a.equals(b);
    }



   public static void main(String[] args) {
        
        MyGenricType<String> m1 = new MyGenricType<String>("abc", "xyz");
        System.out.println(m1.isValueEqual());
        
        MyGenricType<Integer> m2 = new MyGenricType<Integer>(15, 15);
        System.out.println(m2.isValueEqual());
        
        MyGenricType<Student> m3 = new MyGenricType<Student>(new Student(1,"raj" ,21), new Student(1 ," raj" ,21));
        System.out.println(m3.isValueEqual());




    }



}
