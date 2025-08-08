package com.basicProgram;

//Java program to check a Palindrome number using array(as String +Char Array) in java
//Using Array program

public class PalindromeNum {

	public static void main(String[] args) {
		
		String num="242";
	    char arr[]=num.toCharArray();
		
		boolean isPalindrome=true;
		
		for(int i=0;i<arr.length/2; i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome)
		{
			System.out.println("Palindrome number ");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
		
				
		//Simple java code(Without Using Array) Java program to check Palindrome number
		//without using array -no char[],no string[]
		int number=535;
		int original=number;
		int reversed=0;
		while(number !=0)
		{
		int digit=number%10;    //get last digit
		reversed=reversed*10+digit;        //build reversed number
		number=number/10;                         //remove last digit
		}
		if(original==reversed)
		{
			System.out.println(original+" "+"Palindrome number ");
		}
		else
		{
			System.out.println(original+" "+" NOT a Palindrome number ");
		}
		
				
	}

}
