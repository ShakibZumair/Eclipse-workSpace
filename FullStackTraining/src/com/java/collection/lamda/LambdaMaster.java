//package com.java.collection.lamda;
//interface MyApp{
//	int mysum(int a, int b);
//	boolean checkage(int age);
//}
//public class LambdaMaster {
//public static void main(String[] args) {
//	MyApp a=new MyApp() {
//		
//		@Override
//		public int mysum(int a, int b) {
//			// TODO Auto-generated method stub
//			return a+b;
//		}
//		
//		@Override
//		public boolean checkage(int age) {
//			// TODO Auto-generated method stub
//			return age>18;
//		}
//	};
//	MyApp a2= (int a ,int b)->a+b;
//	System.out.println(a.mysum(5,6));
//}
//}
package com.java.collection.lamda;
@FunctionalInterface
interface MyApp{
	int mysum(int a, int b);
//	boolean checkage(int age);
}
public class LambdaMaster {
public static void main(String[] args) {
//	MyApp a=new MyApp() {
//		
//		@Override
//		public int mysum(int a, int b) {
//			// TODO Auto-generated method stub
//			return a+b;
//		}
//		
//		
//	};
	MyApp a2= (a ,b)->a+b;


	System.out.println(a2.mysum(5,6));
	
}
}