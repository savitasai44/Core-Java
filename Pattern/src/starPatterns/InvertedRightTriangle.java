package com.starPatterns;

import java.util.Scanner;

public class InvertedRightTriangle {
	
	public static void main(String[] args) {
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
