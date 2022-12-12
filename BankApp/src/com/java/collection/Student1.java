package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class StudentAgeComparator {

}

public class Student1 {

	public static void main(String[] args) {
	        List<Student> list=new ArrayList<Student>();
            System.out.println();
	        
	      list.add(new Student(1,"amit",31));
	      list.add(new Student(1,"neha",21));
	      list.add(new Student(1,"amit",43));
	      list.add(new Student(1,"amit",23));
	      Collections.sort(list, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return 0;
			}
	    	  
	  
//for(String s:list) {
//	System.out.println(s+" ");
//}
	   }

}
}