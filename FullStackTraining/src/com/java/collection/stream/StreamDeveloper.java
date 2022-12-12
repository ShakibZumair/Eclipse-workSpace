package com.java.collection.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class StreamDeveloper {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,5,8,9,6,7);
	//list.stream().forEach(i->System.out.print(i+" "));
	//System.out.println();
//	list.stream().filter(i->i%2==0).forEach(i->System.out.print(i+" "));

//	list.stream().filter(e->e%2==0).map(i->i*i).forEach(i->System.out.print(i+" "));
	
	Function<Integer,Integer> factorial=(a)->{
		
//		int fact=1;
//		for (int i=1;i<=a;i++ )
//			fact=fact*i;
//		return fact;
		return IntStream.range(1, a+1).reduce(1,(x,y)->x*y);
	};
	list.stream().filter(e->e%2!=0).map(i->factorial.apply(i)).forEach(i->System.out.print(i+" "));
	
	
	
	int i=IntStream.range(1, 11).reduce(0,(x,y)->x+y);
	System.out.println("the value of a is "+i);
	
	System.out.println("the greatest elements in the array is "+list.stream().reduce(1, (x,y)->x>y?x:y));
	
}

}
