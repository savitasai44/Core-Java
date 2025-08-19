package Level1Basicstask;

import java.util.Scanner;

public class UpperCase_LowerCase {
	/*public static void main(String[] args) {
		String str="savita Dhembre..";
		System.out.println(str);
		System.out.println("UpperCase String:"+str.toUpperCase());
		System.out.println("LowerCase String :"+str.toLowerCase());
	}*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		//System.out.println(str);
		System.out.println("UpperCase String:"+str.toUpperCase());
		System.out.println("LowerCase String :"+str.toLowerCase());
	}

}
