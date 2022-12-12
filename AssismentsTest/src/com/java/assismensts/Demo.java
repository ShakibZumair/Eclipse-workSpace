package com.java.assismensts;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	  
	static void wordCount(String s)
    {
       	
	HashMap<String , Integer> count = new HashMap<String, Integer>();



String [] strArray = s.split(s);

for (String c : strArray) {
    if (count.containsKey(c)) {

        
    	count.put(c, count.get(c) + 1);
    }
    else {

        
    	count.put(c, 1);
    }
}


for (Map.Entry entry : count.entrySet()) {
    System.out.println(entry.getKey() + " " + entry.getValue());
}
}
public static void main(String[] args)
{
    String str = "I love java because java is good";
    wordCount(str);
}
  



}
