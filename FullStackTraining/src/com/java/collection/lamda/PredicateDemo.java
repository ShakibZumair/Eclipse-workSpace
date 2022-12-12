package com.java.collection.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
public static void main(String[] args) {
//	List <Integer> friend=Arrays.asList(1,3,12,2,4,10,34,8,5,7);
//	friend.stream().filter(i->i%2==0).collect(Collectors.toList());
//	
	Employee emp=new Employee(1,"ajay",21,"ajay@gmail.com");
	Predicate<Integer> p= (a)->a>18;
	System.out.println("Age is greater than 18 "+p.test(emp.getAge()));
	
	Function <Integer,Integer> f=(a)->a*a*a;
	System.out.println(f.apply(3));
}
}
