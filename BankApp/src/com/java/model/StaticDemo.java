package com.java.model;

public class StaticDemo {
static private  String name;
static private String organization;
private String email;

public static void m1 () {
	StaticDemo.name="zumair";
	StaticDemo.organization="Yash";
	System.out.println(name);
	System.out.println(organization);
	//StaticDemo.email="zumair@gmail.com";

}
static {
	System.out.println("this is Static method");
}
public static void main(String[] args) {
	StaticDemo.m1();
}
}
