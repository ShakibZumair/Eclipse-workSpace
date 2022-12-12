package com.demo;

 class Practice1 {
	
	public void  show() {
		System.out.println("this is Practice");
	}

	public void  demo() {
		System.out.println("this is PracticeDemo");
	}
	}
class Revision extends Practice1{
	public void show () {
		System.out.println("this is Revision");
	}
	public void NameChange () {
		System.out.println("this is RevisionNameChange");
	}
}

 public class Practice {
	 public static void main(String[] args) {
		 Practice1 p= new Revision();
		 p.show();
		 p.demo();
		 
		 
		 
			}
}
 
 