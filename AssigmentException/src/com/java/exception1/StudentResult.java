package com.java.exception1;

public class StudentResult {
	private int Physics =90;
	private int Mathematics=80;
	private int Chemestry=40;
	private int English=20;
	private int Hindi=80;
     


	public int getPhysics() {
		return Physics;
	}
	public void setPhysics(int physics) {
		Physics = physics;
	}
	public int getMathematics() {
		return Mathematics;
	}
	public void setMathematics(int mathematics) {
		Mathematics = mathematics;
	}
	public int getChemestry() {
		return Chemestry;
	}
	public void setChemestry(int chemestry) {
		Chemestry = chemestry;
	}
	public int getEnglish() {
		return English;
	}
	public void setEnglish(int english) {
		English = english;
	}
	public int getHindi() {
		return Hindi;
	}
	public void setHindi(int hindi) {
		Hindi = hindi;
	}

	public String toString() {
		return "StudentResult [Physics=" + Physics + ", Mathematics=" + Mathematics + ", Chemestry=" + Chemestry
				+ ", English=" + English + ", Hindi=" + Hindi + "]";
	}
	

}
