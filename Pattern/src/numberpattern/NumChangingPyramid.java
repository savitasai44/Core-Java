package com.numberpattern;

public class NumChangingPyramid {
	


	public static void main(String[] args) {
	 System.out.println("NUMBERS  .... to 1");
		int num =1;
	for(int i=6; i>=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
	
	System.out.println("NUMBERS 1 to ....");
	int num1 =1;
	for(int i=1; i<=6; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(num1+" ");
			num1++;
		}
		System.out.println();
	}
	
   }
}
