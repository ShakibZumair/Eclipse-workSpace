package com.java.assismensts;

public class Occurrence {
		 
		
		    static final int ASCII_SIZE = 256;
		   public  static char maximum(String str1)
		    {
		      
		        int count[] = new int[ASCII_SIZE];
		 
		        int len = str1.length();
		        for (int i = 0; i < len; i++)
		            count[str1.charAt(i)]++;
		 
		        int max = -1;
		        char result = ' '; 
		 
		       
		        for (int i = 0; i < len; i++) {
		            if (max < count[str1.charAt(i)]) {
		                max = count[str1.charAt(i)];
		                result = str1.charAt(i);
		            }
		        }
		 
		        return result;
		    }
	
		    public static void main(String[] args)
		    {
		        String str1 = "I love java because java is good";
		        System.out.println("Max occurring character is "  + maximum(str1));
		    }
		
		
	}
