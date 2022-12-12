package com.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;
//
//public class SupplierDemo implements Supplier<String> {
//
//
//@Override
//public String get() {
//String s="Welcome to java8 family";
//	return s;
//}
//
//public static void main(String[] args) {
//Supplier s= new SupplierDemo();
//System.out.println(s.get());
//}
//}

public class SupplierDemo  {

public static void main(String[] args) {
	Map<String , Integer> m= new HashMap <String , Integer>();
	m.put("a",1);
	m.put("b",2);
	m.put("c",3);
	m.put("d",4);
	m.forEach((k,v)->System.out.println(k+":"+v));
	Supplier<String> supplier=()->{
return"welcome";
	};
	System.out.println(supplier.get());
}

}
