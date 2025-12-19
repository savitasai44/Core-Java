package placement;

import java.util.Arrays;
import java.util.Scanner;

public class CountArray {
	public static void main(String[] args) {
		
	///EVEN number COUNT	
		Scanner sc= new Scanner(System.in);
		int arr[]=new int [6];
		
		int count=0;
		int oddcount=0;
		
		for(int i=0;  i<arr.length;  i++) {
			System.out.println("enter the array elements");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;  i<arr.length; i++) {
			if(arr[i]%2==0) {
				count++;
			}
			if(arr[i]%2!=0) {
				oddcount++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("EVEN number"+count);
		System.out.println(Arrays.toString(arr));
		System.out.println("ODD number"+oddcount);
		sc.close();
		
		
		
	}
}
