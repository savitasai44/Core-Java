package com.basicProgram;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]= {20,30,40,50,60};
		
		System.out.println("Using for loop :");
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Using toString method :"+Arrays.toString(arr));
	}
}
