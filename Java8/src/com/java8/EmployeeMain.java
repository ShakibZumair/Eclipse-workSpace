package com.java8;

import java.util.Arrays;

public class EmployeeMain {
public static void main(String[] args) {
	
	String s="stylE";
	System.out.println(s.length());
	byte [] b= s.getBytes();
	System.out.println(Arrays.toString(b));
	
	System.out.print(EmployeeDao.getAllEmployee());
}
}
