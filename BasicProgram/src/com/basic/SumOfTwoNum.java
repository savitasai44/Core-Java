package com.basic;

import java.util.Scanner;

public class SumOfTwoNum {
	
	public static void main(String[] args) {
		
		int n1=4;
		int n2=3;
		int n3=n2+n1;
		System.out.println(n3);
		
		
  //accept value from user
		Scanner sc= new Scanner (System.in);
		System.out.println("enter num1 +num2 :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		//int num3=num1+num2;
		System.out.println(num1+num2);
		//System.out.println(num3);
	
	
	}

}
