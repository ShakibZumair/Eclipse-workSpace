
public class Permutns {
	

		   // Function to display all permutations of the string str
		   static void printallPermutns(String str, String str2)
		   {
		       // check if string is empty or null
		       if (str.length() == 0) 
		         {
		           System.out.print(str2 + " ");
		           return;
		         }
		      
		       for (int i = 0; i < str.length(); i++) 
		         { 
		           // ith character of str
		           char ch = str.charAt(i); 
		           // Rest of the string after excluding
		           // the ith character
		           String str3 = str.substring(0,i)+ str.substring(i + 1);
		        //  System.out.println(str3);
		           // Recursive call
		           printallPermutns(str3,str2+ch );
		        }
		   } 
		   // Driver code
		   public static void main(String[] args)
		   {
		       String s = "cat";
		       printallPermutns(s, "");
//	       String h= "helloertr";
//	       for (int j=0 ;j<h.length();j++) {
//	       char c=h.charAt(j);
//	       String sc="";
//	       String w="rhone";
          // System.out.println(h.substring(2,4));
	       //System.out.println(w+c);
	       }
	       
		}
		

