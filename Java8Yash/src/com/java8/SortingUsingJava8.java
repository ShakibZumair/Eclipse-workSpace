package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingJava8 {

	public static void main(String[] args) {
		List <String> l= new ArrayList<String>();
		l.add("Zjay");
		l.add("Bjay");
		l.add("Cjay");
		l.add("Djay");
		l.add("Ejay");
//		Collections.sort(l);
		SortingUsingJava8 s=new SortingUsingJava8();
	    s.sortList(l);
	    System.out.println("SortingList is  -> "+l);
		
		
	
	}
	private void sortList (List <String> name) {
		Collections.sort(name,(s1,s2)->s2.compareTo(s1));
		System.out.println(name);
	}
}
