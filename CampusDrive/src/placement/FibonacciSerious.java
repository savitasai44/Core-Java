package placement;

import java.util.Scanner;

public class FibonacciSerious {
	
	public static void main (String args[]) {
		
	/*	int n=5;      //number of terms
		int a=0,b=1;                        //initialization of two numbera and b
		
		for(int i=0;i<=n; i++) {              //run loop for n times
			System.out.println(a);          //print the current fibonacci number
			int c=a+b;         //calculate the number
			a=b;     //moves number into b
			b=c;         //move into next number
			
		}
		*/
		
		
		//using the scanner class  accept the input from user
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int a=0,b=1;
		int c;
		
		for(int i=0; i<=num; i++) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		sc.close();
		
	}

}
