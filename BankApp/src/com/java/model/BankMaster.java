package com.java.model;

abstract class Shape{
	abstract void draw();
	abstract void f1();
}
class Rectangular extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Rectangular");
	}
	void f1() {
		  System.out.println("this is F1 from Rectangular");
	  }
}
class Triangle  extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Triangle");

	}
	void f1() {
		  System.out.println("this is F1 from Triangle");
	  }
}
class Square  extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Square");
	}
  void f1() {
	  System.out.println("this is F1 from square");
  }
	
	
}
public class BankMaster {
public static void main(String[] args) {
	/*Shape[] s= {new Triangle (),new Square(), new Rectangular()};
	for(Shape s1:s) {
		s1.draw();
		s1.f1();*/
	Employee e= new Employee();
	try {
		
		e.setEmail("shakib@gmail.com");
	}catch(EmailNotValidException ex) {
		System.out.println(ex.getMessage());
	}
	System.out.println(e);
}
}
