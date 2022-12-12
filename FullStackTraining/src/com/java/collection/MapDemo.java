package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
public static void main(String[] args) {
	Map<String,Integer> m=new HashMap<String,Integer>();
	m.put("amit", 21);m.put("nitin", 30);m.put("ajay", 18);m.put("suraj", 11);
	System.out.println(m);
//	for(String s:m.keySet()) {
//		System.out.println("The age of "+s+" is "+m.get(s));
//	}
	for(Entry<String,Integer> s:m.entrySet()){
		System.out.println("The age of "+s.getKey()+" is "+s.getValue());
		
	}
}
}
