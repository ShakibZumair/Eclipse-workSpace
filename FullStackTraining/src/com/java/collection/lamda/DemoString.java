package com.java.collection.lamda;

import java.util.Arrays;
import java.util.List;

public class DemoString {
public static void main(String[] args) {
	List <String> friend=Arrays.asList("amit","neha","vishal","rahul");
	friend.sort((o1,o2)->o1.compareTo(o2));
	for(String s: friend)
	System.out.println(s +" ");
}
}
