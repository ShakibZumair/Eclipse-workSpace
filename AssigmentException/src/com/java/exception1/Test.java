package com.java.exception1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		Student s = new Student();
		System.out.println("Enter student rollNo:");
		Integer rollno = sc.nextInt();
		s.setRollno(rollno);
		System.out.println("Enter student name:");
		String sname = sc.next();
		s.setSname(sname);
		System.out.println("Enter student address:");
		String sAddr = sc.next();
		s.setSaddress(sAddr);


		StudentResult sr = new StudentResult();
		System.out.println("Enter Mathematics marks:");
		Integer mathMrks = sc.nextInt();
		sr.setMathematics(mathMrks);
		System.out.println("Enter Physics marks :");
		Integer physcMrks = sc.nextInt();
		sr.setPhysics(physcMrks);
		System.out.println("Enter Chemistry marks :");
		Integer chemMrks = sc.nextInt();
		sr.setChemestry(chemMrks);
		System.out.println("Enter you English marks");
		int englishMark =sc.nextInt();
		sr.setEnglish(englishMark);
		System.out.println("Enter you Hindi marks");
		int hindiMark =sc.nextInt();
		sr.setEnglish(hindiMark);

		s.setSrobj(sr);

		float total=(mathMrks+physcMrks+chemMrks+hindiMark+englishMark)*100;
		float avg=total/500;
		System.out.println("Avg:"+avg);
		try{

		if(mathMrks <0 || physcMrks<0 || chemMrks<0 || englishMark<0 ||hindiMark<0)
		{
			throw new ResultException("Negative marks not allowed");
		}else if(physcMrks<40 && mathMrks<40)
		{
			throw new ResultException("You are failed");
		}else
		{

		}if(avg < 40)
		{
			throw new ResultException("Student failed");
		}else
		{
			System.out.println("student passed");
		}

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
