package com.demo.string;

public class HashEq {
	public static void main(String[] args) {
		Student s= new Student(1,"Newa",4);
		Student s1= new Student(1,"Newa",4);
		if (s==s1) {
		System.out.println("bacha mi gaya");
	}else {
		System.out.println("bacha nhi mila ");
	}
		
}
}
	
	class Student {
		private int id;
		private String name;
		private int age;
		
		public Student () {
			
		}
		public Student(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 1;
		}
		@Override
		public boolean equals(Object o) {
			// TODO Auto-generated method stub
			Student h=(Student) o;
			if(this.getName().equals(h.getName())&& this.getAge()==h.getAge()&& this.getId()==h.getId())
			return true;
			else
			return	false;
		}
	}



