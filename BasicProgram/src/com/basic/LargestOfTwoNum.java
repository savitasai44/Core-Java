package com.basic;

import java.util.Scanner;

public class LargestOfTwoNum {

	public static void main(String[] args) {
		int n1=3, n2=4;
		if(n1>n2) {
			System.out.println("n1 is largest number ");
		}
		else {
			System.out.println("n2 is the largest number");
		}
		
		
	//Accept input  from user
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the two number :");
		int num1=sc.nextInt(),num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("Num 1 is the largest number ");
		}
		else {
			System.out.println("Num 2 is the largest number ");
		}
	}
}
