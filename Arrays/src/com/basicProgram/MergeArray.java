package com.basicProgram;
import java.util.Arrays;
import java.util.Scanner;


//java program to merge two arrays into one.
public class MergeArray {
	public static void main(String[] args) {

		int arr1[]= {4,5,6};
		int arr2[]= {7,8,9};
		int merge[]=new int[arr1.length+arr2.length];  //create new array with combined length
		for(int i=0;i<arr1.length;i++) {
			merge[i]=arr1[i];              
		}
		for(int i=0; i<arr2.length; i++) {
			merge[arr1.length+i]=arr2[i];          
		}
		System.out.println("Number Array merge :"+Arrays.toString(merge));       
		
	
		
	//java program to merge two String arrays into one.
		String str1[]={"Saviii",};
		String str2 []={"Java devloper...."};
		String merges[]=new String[str1.length+str2.length];
		for(int i=0;i<str1.length;i++) {
			merges[i]=str1[i];
		}
		for(int i=0; i<str2.length;i++) {
			merges[str1.length+i]=str2[i];
		}
		System.out.println("String Array merge:"+Arrays.toString(merges));
			
	
		
	//WAP to merge two array where elements are Accepted from the user
		Scanner sc= new Scanner ( System.in);
		System.out.println("Enter size of first array ");  //first array
		int size1=sc.nextInt();
		String array1[]=new String[size1];
		System.out.println("enter elements of first array :");
		for(int i=0; i<size1; i++) {
			array1[i]=sc.nextLine();
		}
		
		System.out.println("Enter size second array ");           //second array
		int size2=sc.nextInt();
		String array2[]=new String[size2];
		System.out.println("enter elements of second array :");
		for(int i=0; i<size2; i++) {
			array2[i]=sc.nextLine();
		}
		
		String mer[]=new String[size1+size2];                //Merge array
		for( int i=0;i<size1; i++) {
			mer[i]=array1[i];
		}
		for(int i=0; i<size2; i++) {
			mer[size1+i]=array2[i];
		}
		System.out.println(Arrays.toString(mer));
		
		
	}
	
}
