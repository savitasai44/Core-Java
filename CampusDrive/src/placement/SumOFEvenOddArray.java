package placement;

import java.util.Arrays;
import java.util.Scanner;

public class SumOFEvenOddArray {
	public static void main(String[] args) {
		
	/*	Scanner sc= new Scanner(System.in);
		int arr[]= new int[8];
		int sum=0;
		
		for(int i=0;  i<arr.length;  i++) {
			System.out.println("enter the array elemnets");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;  i<arr.length;  i++) {
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		
		*/
		
		
		
		Scanner sc= new Scanner (System.in);
		int arr[]=new int[8];
		
		int sum=0;
		
		for(int i=0;  i<arr.length;  i++) {
			System.out.println("enter the array elemnets");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;  i<arr.length; i++) {
			if(arr[i]%2==1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);
		
		sc.close();
	}

	
}
