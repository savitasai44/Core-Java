package com.basicProgram;

import java.util.Arrays;
import java.util.Scanner;


//Count the EVEN and ODD number using the array
public class CountEvenOdd_Number {
	
	public static void main(String[] args) {
		
		int arr[]= {4,6,5,3,2};
		int even=0;
		int odd=0;
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			}
			if(arr[i]%2==1)
			{
				odd++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Count the EVEN number"+" "+even);
		System.out.println("Count the ODD number"+" "+odd);
		
		
		
   //User input Count the EVEN and ODD number using the arrays .(Scanner class)
		
		Scanner sc= new Scanner(System.in);
		int EvenNum=0;
		int OddNum=0;
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the numbers :");
			arr[i]=sc.nextInt();
			
			if(arr[i]%2==0)
			{
				EvenNum++;
			}
			if(arr[i]%2==1)
			{
				OddNum++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Count the EVEN number"+" "+EvenNum);
		System.out.println("Count the ODD number"+" "+OddNum);
	
		
		
	}

}
