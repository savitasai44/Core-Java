package Level2Moderatetask;

import java.util.Scanner;

public class CountNumberOfAlphabetes {
	/*public static void main(String[] args) {
		String str="I love coding";
		int alpha=0;
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alpha++;
			}
		}
		System.out.println("String :"+str);
		System.out.println("Alphabets :"+alpha);
	}*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Username :");
		String str=sc.nextLine();
		System.out.println("String :"+str);
		int alpha=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				alpha++;
			}
		}
		System.out.println("Alphabets :"+alpha);
	}

}
