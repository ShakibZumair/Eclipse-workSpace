package com.java.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set<String> s= new HashSet<String>();
	s.add("ajay");s.add("amit");s.add("neha");s.add("ajay");
	System.out.println(s.size());
	System.out.println(s);
	
	for (String s1:s) {
		System.out.println(s1+" ");
	}
	Set <Integer> set= new HashSet<Integer>();
	Set <Integer> set2= new HashSet<Integer>();
	set.add(1);set.add(5);set.add(2);set.add(8);
	set2.add(3);set2.add(5);set2.add(4);set2.add(8);
	
	set.addAll(set2); //for union
	for(int i:set) {
		System.out.println(i);
	}
	set.retainAll(set2);  // for Intersection
	for(int i:set) {
		System.out.println(i);
	}
}
}
