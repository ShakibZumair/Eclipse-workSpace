/* WAP for printing elements whose start with n; */
	/* WAP for printing elements remove start with n; */

package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class ArrayListDemo {
public static void main(String[] args) {
	List<String> list= new ArrayList<String>();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name of the user");
	String name=sc.next();
	list.add("Shakib");list.add("Zumair");list.add("Naha");list.add("Jatin");
	
	
	/* Using foreach we are print list */
//	for(String s:list) {
//		System.out.println(s);
//	}
	Collections.sort(list);
	/* Using Iterator we are print list */
//	Iterator<String> itr=list.iterator();
//	while(itr.hasNext()) {
//	
//		System.out.println(itr.next());
//	}
	
	for(String s:list) {
		System.out.println(s);
	}
	if (list.indexOf(name)!=-1){
		System.out.println("name is in the list");
	} else {
		System.out.println("name is not in the list");
	}
	}
}

