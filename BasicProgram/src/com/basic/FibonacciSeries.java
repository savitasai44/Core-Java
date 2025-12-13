
//1,1,1,2,3,5,8,13,21,34,55,89,.....rule fib(0)=0 
                              //fib(1)=1
                            //fib(n)=fib(n-1)+fib(n-2)(n>-2

package com.basic;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c;
		
		System.out.println(a+" "+b);
		
		for(int i=0; i<=10; i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
		
	}

}
