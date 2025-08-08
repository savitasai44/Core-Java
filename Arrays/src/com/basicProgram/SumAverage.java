package com.basicProgram;

public class SumAverage {

	public static void main(String[] args) {
		
		int arr[]= {6,4,5,2,3};
		int sum=0;
		int average=0;
		
		for(int i=0;i<arr.length; i++)
		{
			sum=sum+arr[i];
			average=sum/arr[i];
		}
		System.out.println("Sum :"+sum);
		System.out.println("Average :"+average);

	}

}
