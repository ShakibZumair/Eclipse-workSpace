package com.java.collection;

import java.util.Arrays;

public class MapDemo2 {
	public static void main(String[] args) {

		String s = "teem";
		String s1 = "meet";
		
//		str1 = str1.toLowerCase();
//		str2 = str2.toLowerCase();
		    
		    
		char[] charArray1 = s.toCharArray();
		char[] charArray2 = s1.toCharArray();

// sort the char array
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

// if sorted char arrays are same
// then the string is anagram
		boolean result = Arrays.equals(charArray1, charArray2);

		if (result) {
			System.out.println(s + " and " + s1 + " are anagram.");
		} else {
			System.out.println(s + " and " + s1 + " are not anagram.");
		}
	}

}
