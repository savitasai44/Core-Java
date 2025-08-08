package com.basicProgram;

public class MaxMinNumber {
	
	public static void main(String[] args) {
		
		int arr[]= {4,5,9,2,6};
		int max=0,min=0;
		
		for(int i=0;i<arr.length; i++) {
		if(arr[i]<min) 
		{
			min=arr[i];
		}
		if(arr[i]>max)
		{
			max=arr[i];
		}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
