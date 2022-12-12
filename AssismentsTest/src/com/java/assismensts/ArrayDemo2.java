package com.java.assismensts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ArrayDemo2 {
	public static void main(String[] args) {
//	//	String s="www";
//		  int num[]= {-1,2,-3,3};
//   	  Set  s = new HashSet();
//   	     s.add(num);
//		 for (int i=0; i<=num.length;i++) {
//		    if (num[0]>num[i]) {
//		    	System.out.println(num);
//		    }
//			
//		 }
//		
//		
//	}
//}

	//	String s="www";
		  int num[]= {-1,2,-3,3};
		  Arrays.asList(num);
   	  Set  s = new HashSet();
   	       s.addAll(-1,2,-3,3);
   	     s.add(num);
		 for (int i=0; i<=num.length;i++) {
		    if (num[0]>num[i]) {
		    
		    	System.out.println(s);
		    	
		    	
		    	
		    }
			
		 }
		
		
	}
}