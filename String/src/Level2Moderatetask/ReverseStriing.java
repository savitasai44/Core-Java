
//Reverse a String
package Level2Moderatetask;

import java.util.Scanner;

public class ReverseStriing {
	/*public static void main(String[] args) {
		String str="savita";
		String rev="";
		for(int i=str.length()-1;i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("original String :"+str);
		System.out.println("Reversed String :"+rev);
	}*/
	
	//accept input from user...
	/*public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a String :");
		String str= sc.nextLine();
		String rev="";
		System.out.println("Original String :"+str);
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse a String :"+rev);
	}*/
	
	
	
  //reverse a String using the StringBuilder.....
	
	
	/*public static void main(String[] args) {
		String str="sai";  //stored in str and pass StringBuilder
		StringBuilder sb= new StringBuilder(str);
		System.out.println(sb.reverse());
	}*/
	
  //another way pass string in StringBuilder PARAMETER
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("sai");
		System.out.println(sb.reverse());
	}
	
	
	
}
