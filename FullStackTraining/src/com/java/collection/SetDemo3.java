package com.java.collection;

import java.util.HashSet;
import java.util.Set;

/*Count number of elements in the array that are unique*/
//public class SetDemo3 {
//public static void main(String[] args) {
//	int [] arr= {1,2,1,3,2,1,5,6,8,7,5};
//	Set <Integer> s=new HashSet<Integer>();
//	for(int a:arr) {
//	s.add(a);
//	}
//	System.out.println(s.size());
//	System.out.println(s);
//}
//}


/*print all the number of elements in the array that are not  unique*/

public class SetDemo3 {
public static void main(String[] args) {
	int [] arr= {1,2,1,3,2,1,5,6,8,7,5};
	Set <Integer> s=new HashSet<Integer>();
	for(int a:arr) {
		if(!s.add(a)) {
			System.out.println(a);
		}
	}
	System.out.println(s.size());
	// System.out.println(s);
}
}