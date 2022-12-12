package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		
	
int arr[]= {1,2,3,1,3,4,5,6,4,1,7,8,1};
Map<Integer,Integer> m=new HashMap<Integer,Integer>();
for(int a:arr) {
if (m.containsKey(a)) {
	m.put(a, m.get(a)+1);
}
else {
	 m.put(a, 1);
}
for(Integer i:m.keySet())
System.out.println("the frequency of  "+i+" is "+m.get(i));
}
}
}