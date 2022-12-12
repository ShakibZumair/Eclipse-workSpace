package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(1,2,3,4,5);
	a.stream().filter(i->i%2==0).forEach(o->System.out.println("print even number :"+o));;
}
}
