package placement;

import java.util.Scanner;

public class PalindromeNum {
	
	/*public static void main(String args[]) {
		
		int num=121;
		int rev=0;
		int originalnum=num;
		
		
		while(num>0) {
			int digit =num%10 ;  //get last digit
			rev=rev*10+digit;   //build reversed number
		   num=num/10;       //remove last digit
		}
		if(originalnum==rev) {
			System.out.println("palindrome number.....");
			
		}else
		{
			System.out.println("NOT palindrome number...");
		}
		
	}*/
	
	
	//Accept input from the user
	
	public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number ?");
		int num=sc.nextInt();
		System.out.println(num);
		int revNum=0;
		int originalNum=num;
		
		while(num>0) {
			int digit=num%10;
			revNum=revNum*10+digit;
			num=num/10;
		}
		if(originalNum==revNum) {
			System.out.println("palindrome number....");
		}
		else {
			System.out.println("Not palindrome number.......");
		}
		
		sc.close();
	}
	
	

}
