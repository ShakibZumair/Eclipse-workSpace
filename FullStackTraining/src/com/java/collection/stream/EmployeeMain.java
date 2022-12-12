package com.java.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeMain {
public static void main(String[] args) {
//	Employee e1 = new Employee(1,"amit nigam", 31, "amit@gmail.com" , "sales");
//    Employee e2 = new Employee(2,"neha sharma", 32, "neha@gmail.com" , "marketing");
//    Employee e3 = new Employee(3,"vishal mathur", 25, "vishal@msn.com" , "sales");
//    Employee e4 = new Employee(4,"jatin nigam", 27, "jatin@rediff.com" , "finance");
//    
	Employee e1 = new Employee(1,"amit nigam", 31, "amit@gmail.com" , "sales");
    Employee e2 = new Employee(2,"amit nigam", 32, "neha@gmail.com" , "marketing");
    Employee e3 = new Employee(3,"vishal mathur", 25, "vishal@msn.com" , "sales");
    Employee e4 = new Employee(4,"jatin nigam", 27, "jatin@rediff.com" , "finance");
    Employee e5 = new Employee(5,"akash kalanke", 26, "akash@rediff.com" , "finance");
    Employee e6 = new Employee(7,"prashant shejul", 25, "prashant@gmail.com" , "finance");
    Employee e7 = new Employee(8,"nitin nigam", 26, "nitin@gmail.com" , "marketing");
    
  /*  List<Employee>  employees=Arrays.asList(e1 , e2 , e3 , e4);
    employees.stream().
    filter(e->e.getDepartment().equals("sales")).
    map(e->e.getName().substring(0, e.getName().indexOf(" "))).
    forEach(System.out::println);
    
//   employees.stream().filter(e->e.getDepartment().equals("sales")).map(e->e.getAge()).reduce(1,(x,y)->x>y?x:y);
 //   employees.stream().sorted((emp1,emp2)->emp2.getAge()-emp1.getAge()).limit(1).forEach(System.out::println);
   // employees.stream().filter(em->em.getDepartment().equals("sales")).sorted((em1,em2)->em2.getAge()-em1.getAge()).limit(1). map(es->es.getName().substring(0, es.getName().indexOf(" "))). forEach(System.out::println);
  //  employees.stream().collect(Collectors.averagingInt(null))
    employees.stream().collect(Collectors.averagingInt(e->e.getAge())).intValue();
    List<Employee> semployees=employees.stream().filter(e->e.getDepartment().equals("sales")).collect(Collectors.toList());
    semployees.stream().forEach(System.out::print);
    */
    /*if 2 name are repeating at the time we are selecting from this (old,young)->young)*/
  //  List<Employee>  employees=Arrays.asList(e1 , e2 , e3 , e4);
    List<Employee>  employees=Arrays.asList(e1 , e2 , e3 , e4,e5,e6,e7);
    Map<String,Integer> m1=employees.stream().collect(Collectors.toMap(e->e.getName(), e->e.getAge(),(old,young)->young));
    for (String s:m1.keySet())
     System.out.println("employee "+s+" has Age "+m1.get(s));
    Map<String,List<Employee>> m2=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
    m2.get("sales").stream().forEach(System.out::print);
    System.out.println();
    Map<String ,Long> m3=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
    for(String s:m3.keySet())
    	System.out.println("Department "+s+" has "+ m3.get(s)+" employees "  );
    Predicate<Employee> es=(e)->e.get
}
}