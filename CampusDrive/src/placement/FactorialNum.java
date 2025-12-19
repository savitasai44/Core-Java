package placement;

import java.util.Scanner;

public class FactorialNum {
	
	public static void main(String args[]) {
		
/*		int n=5;
		int fact=1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		
		System.out.println("Factorial Number :"+fact);
		
		*/
		
		//accept the input from user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number :");
		int num=sc.nextInt();
		int fact=1;
		
		for(int i=1; i<=num; i++) {
			
			fact=fact*i;
		}
		
	      System.out.println("Factorial number :"+fact);
		
	}

}
