
//Factorial number 5=5*4*3*2*1=120 
//using loop method for easy,memory-friendly
package com.basic;

public class FactorialOfNumber {
	
	/*public static void main(String[] args) {
		
		int fact=1;
		int num=5;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of Number :"+fact);
	
		
	//accept input from user
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number :");
		int number=sc.nextInt();
		int factorial=1;
		for(int i=1; i<=number; i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial of Number :"+factorial);

		sc.close();*/
		
		
		 //Recursion method - function calls itself.simple logic, but uses more memory (Stack)
		static int fact(int n) {
			if(n==0 || n==1) {
				return 1;
			}else
			{
				return n*fact(n-1);
			}
		}
 
		public static void main(String[] args) {
			
			int num=5;
			int result=fact(num);
			System.out.println(result);
	}

}
