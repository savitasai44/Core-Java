package com.basicProgram;

import java.util.Arrays;
import java.util.Scanner;

//find duplicate elements in an array

public class FindDuplicate {
	
	public static void main(String[] args) {
		
		int arr[]= {6,8,5,6,8,2,4,4,5};
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		System.out.println();
		
	
		
   //String duplicate character print
		
		String str="Saviitaa";
		char array[]=str.toCharArray();
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[i]);
					break;
				}
			}
		}
		//System.out.println(Arrays.toString(array));
		
		
		
	
	
	}

}
