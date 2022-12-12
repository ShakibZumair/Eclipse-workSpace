package com.java.model;

import java.util.Scanner;
class A{
	int x;
}
class B extends A{
	int y;
}
public class ExceptionDemo {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter your First number");
	int a=s.nextInt();
	
	System.out.println("Please enter your Second number");
	int b=s.nextInt();
	try {
	System.out.println(a+"a divide by b is " +b+" :->" + a%b);
	}catch (ArithmeticException ar){
		System.out.println("Cant divade by zero");
	}
	System.out.println("hello");
	System.out.println(new int [] {1,2,3,}[1]);
//	A a1= null;
//	System.out.println(a1);
	
	/* Code for Class Cast Exception */
//	A a1= new A();
//	B b1=(B)a1;
	B b1=new B();
	if (b1 instanceof A) {
	
	A a1=(A)b1;
	}
	
}
}
