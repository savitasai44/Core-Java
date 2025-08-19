package Level1Basicstask;

import java.util.Scanner;

public class LengthOfString {
	
 /*	public static void main(String[] args) {
		String str="savita";
		System.out.println(str);
		System.out.println("Length:"+str.length());
	}*/
	
	//Accept input from user....
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("String:"+str);
		System.out.println("Length of String :"+str.length());
	}

}
