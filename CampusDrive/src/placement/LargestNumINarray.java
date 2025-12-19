package placement;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumINarray {
	
	public static void main(String[] args) {
		
		
/*	  int arr[]= {10,20,30,40,50};
	  int max=arr[0];
	  
	  for(int i=0; i<arr.length; i++) {
		  
		  if(max>0) {
			  max=arr[i];
			  
			  System.out.println(arr[i]);
		  }
	  }
	  System.out.println(Arrays.toString(arr));
		System.out.println(max);
		
		*/
		
		
		
		Scanner sc= new Scanner(System.in);
		int num[]=new int [5];
		int max=0;
		
		for(int i=0; i<num.length; i++) {
			System.out.println("enter the array elements ..");
			num[i]=sc.nextInt();
			
			if(num[i]>max) {
				max=num[i];
			}
		}
		
		System.out.println(Arrays.toString(num));
		System.out.println(max);
		
	
		sc.close();
	}

}
