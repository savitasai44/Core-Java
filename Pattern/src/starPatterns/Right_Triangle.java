package com.starPatterns;

import java.util.Scanner;

//Right triangle star pattern
public class Right_Triangle {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	
	//accept the input from user 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++) {
			for( int j=1 ;j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
