package com.java.assismensts;

public class Height {

	float feet;
	float inch;
	
	
	public Height(float feet, float inch) {
		super();
		this.feet = feet;
		this.inch = inch;
	}
	public float getFeet() {
		return feet;
	}
	public void setFeet(float feet) {
		this.feet = feet;
	}
	public float getInch() {
		return inch;
	}
	public void setInch(float inch) {
		this.inch = inch;
	}
	
	public void addTwoObject() {
		float a=5.4f;
		float b=6.1f;
		
		
	}
	static float height []= {5,7.2F,4.36f,7,6.1f};
   
    public static void main(String[] args) {
        float temp;
    for (int i=0;i<height.length;i++) {
        for (int j=i+1;j<height.length;j++) {
        if (height[i]>height[j]) {
            temp=height[i];
            height[i]=height[j];
            height[j]=temp;
        }
        }
    }
    System.out.println("Second Largest Array is => "+ height[height.length-2]);
    System.out.println();
    }
}
