package com.demo.string;

public class StringDemo1 {
//public static void main(String[] args) {
//	String s="Happy birthday dear";
//	String[] name=s.split(" ");
//	for (String str:name) {
//		System.out.println(str.charAt(0));
//	}
//}
	public static void main(String[] args) {
		String st="Shakib Zumair";
//	System.out.println(st.substring(1,2));
	System.out.println(st.toUpperCase().charAt(0)+". "+st.toUpperCase().charAt(st.indexOf(" ")+1)+st.substring(st.indexOf(" ")));
		
	}
	
} 
