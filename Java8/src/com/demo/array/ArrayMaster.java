package com.demo.array;

public class ArrayMaster {
public static void main(String[] args) {
	int arr[] []=new int [4][];
	 arr[0]=new int[9];
	 arr[1]=new int[0];
	 arr[2]=new int[7];
	for (int i=0; i<arr.length;i++) {
		for (int j=0; j<arr.length;j++) {
			arr[i][j]=i+j;
		}
	}
//	for (int i=0 ;i<arr.length;i++) {
//		for (int j=0; j<arr.length;j++) {
//			System.out.println(arr[i][j]+" ");
//		}
//	}
	
	for (int br[]:arr) {
		for (int[] x:arr) {
			System.out.println(x+" ");
		}
	} 
}
}
