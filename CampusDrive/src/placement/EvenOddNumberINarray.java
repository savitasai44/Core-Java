package placement;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddNumberINarray {
	
	public static void main(String[] args) {
		
/*		int arr[]= {2,3,4,5,6,7,8};
		int even=0, odd=0;
		
		for(int i=0; i<arr.length; i++) {
			
		   if(arr[i]%2==0) {
	       System.out.println(arr[i]);
		}
		   
		   
   }  */
		
	/*	
		
		Scanner sc= new Scanner(System.in);
		int ar[]=new int[5];
		
		
		for(int i=0; i<ar.length; i++) {	
			System.out.println("enter the array elements:");
			ar[i]=sc.nextInt();
			
		}
		for(int i=0; i<ar.length; i++) {	
			if(ar[i]%2==0) {
				System.out.println(ar[i]);
			}
		}
	//	System.out.println(Arrays.toString(ar));
		sc.close();

		
		*/
		
		
		
		Scanner sc= new Scanner( System.in);
		int arr[]=new int [6];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter the array elements");
			arr[i]=sc.nextInt();
		}	
			for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}
		
		
}
}
