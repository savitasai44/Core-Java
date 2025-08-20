
//String is Palindrome or not ...
//3 Steps-Take input String,Reverse the String,Compare Original and reversed String..
package Level2Moderatetask;

import java.util.Scanner;

public class PalindromeString {
	/*public static void main(String[] args) {
		String str="madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("Originnal String :"+str);
		if(str.equals(rev)) {
			System.out.println("String is Palindrome...");
		}
		else {
			System.out.println("String is not Palindrome....");
		}
	}*/

		
		//Accept input from user..
		/*public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the String :");
			String str= sc.nextLine();
			System.out.println("Original String:"+str);
			String rev="";
			for(int i=str.length()-1; i>=0;i--) {
				rev=rev+str.charAt(i);
			}
			if(str.equals(rev)){
				System.out.println("String is Palindrome...");
			}
			else {
				System.out.println("String is NOT Palindrome....");
			}
	}*/
			
		public static void main(String[] args) {
			int num=121;
			int original=num;
			int rev=0;
			while(num>0) {
				int digit=num%10; //get last digit
				rev=rev*10+digit;   //build reversed number
				num=num/10;      //remove last digit
			}
			if(original==rev) {
				System.out.println("Palindrome Number ...");
			}
			else {
				System.out.println("NOT palindrome");
			}
			
	}
		
}
