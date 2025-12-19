package placement;

import java.util.Scanner;

public class sumOfArray {
	
	public static void main(String[] args) {
		
	
/*	int arr[]= {4,4,4,4};
	int sum=0;
	
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
		sum=sum+arr[i];
	}

	System.out.println(sum);
	
	*/
	
		
		
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter elements");
			arr[i]=sc.nextInt();
			
			sum=sum+arr[i];
			
		}
		
		
		System.out.println(sum);
		sc.close();
}
}