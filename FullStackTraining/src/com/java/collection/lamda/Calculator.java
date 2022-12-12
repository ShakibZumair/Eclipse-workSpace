package com.java.collection.lamda;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface
interface NumMaster{
	boolean checkNumber(int a);
}

interface EvenOrOdd{
	int check(int a);
}
interface GumMaster{
	boolean  checkGmail (String s);
}
public class Calculator {
public static void main(String[] args) {
	//List<Employee> employees=Arrays.asList(new Employee(1,"ajay",21,"ajay@gmail.com"));
	Employee emp=new Employee(1,"ajay",21,"ajay@gmail.com");
	Employee emp1=new Employee(4,"sanjay",34,"sanjay@gmail.com");
	Employee emp2=new Employee(5,"rahul",23,"rahul@rediffmail.com");
	Employee emp3=new Employee(9,"neha",19,"neha@gmail.com");
	List<Employee> employees=Arrays.asList(emp,emp1,emp2,emp3);
	employees.sort((e,e2)->e.getAge()-e2.getAge());
	//employees.sort((e,e2)->e.getName()-e2.getName());
	System.out.println(employees);
	
	/* Fourth and Fifth problem */
//NumMaster n1=(a)->a>20;
//for(Employee e: employees) {
//	//System.out.println(n1.checkNumber(e.getAge())?e.getName():"");
//}
//GumMaster g1=(s)->s.contains("gmail");
//for(Employee e: employees) {
//	System.out.println(g1.checkGmail(e.getEmail())?e.getName():"");
//}



}
}
	/* Third Problem */
//	int arr[]= {1,12,13,18,21,15,19,17};
//	int sum =0;
//	EvenOrOdd e=(a)->a%2==0?a:0;
//	for(int a:arr) {
//		sum +=e.check(a);
//		
//	}
//	System.out.println(sum);
//	
	/* Second Program for Calculating number whose is greater than 18 */
//	int arr[]= {1,12,13,18,21,15,19,17};
//NumMaster n1=(a)->a>18;
//for(int a:arr) {
//	System.out.println(n1.checkNumber(a)?String.valueOf(a)+" ":"");
//}


	
	
	
	/* first Program */
//	MyApp add= (a ,b)->a+b;
//	MyApp subs= (a ,b)->a-b;
//	MyApp multiply= (a ,b)->a*b;
//	MyApp div= (a ,b)->a/b;
//	
//	System.out.println("Multiplying of two number is --> "+multiply.mysum(2, 8));
//	System.out.println("Addition of two number is --> "+add.mysum(2, 8));
//	System.out.println("Substraction of two number is --> "+subs.mysum(2, 8));
//	System.out.println("Division of two number is --> "+div.mysum(2, 8));
	
	
	


