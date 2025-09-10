package com.basic;

import java.util.Scanner;

public class CheckEvenOrOddNum {
	
	public static void main(String[] args) {
		
		int num=5;
		if(num%2==0) {
			System.out.println("Even number ");
		}
		else {
			System.out.println("Odd number");
		}
		
		
	//Accept input from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even number ");
		}
		else {
			System.out.println("Odd number ");
		}
		
	}

}
