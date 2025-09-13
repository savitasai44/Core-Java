package com.basic;

import java.util.Scanner;

public class LeapYearOrNot {
	
	public static void main(String[] args) {
		
		int year=2013;
		if(year%4==0) {
			System.out.println("Leap Year..");
		}
		else
		{
			System.out.println("Not Year ");
		}
		
		
	//Accept input from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter year..?");
		int y=sc.nextInt();
		if(y%4==0) {
			System.out.println("It is a Leap year");
		}
		else
		{
			System.out.println(" Not leap year");
		}
		sc.close();
	}

}
