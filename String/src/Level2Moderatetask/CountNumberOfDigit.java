
////WAP to accept password of the user and count the number of digits in it. 
 
package Level2Moderatetask;

import java.util.Scanner;

public class CountNumberOfDigit {
	/*public static void main(String[] args) {
		String str="Java developed by 1995";
		int digit=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				digit++;
			}
		}
		System.out.println("String is :"+str);
		System.out.println(digit);
	}*/
	
	
   //accept input from user........
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Username :");
		String str= sc.nextLine();
		System.out.println(str);
		int digit=0;
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9') {
				digit++;
			}
		}
		System.out.println(digit);
	}

}
