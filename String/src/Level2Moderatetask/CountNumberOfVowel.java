
//WAP to accept email id of the user and print the number of vowels in it.

package Level2Moderatetask;

import java.util.Scanner;

public class CountNumberOfVowel {
	/*public static void main(String[] args) {
		String str="Savita Dhembre";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);   //count index by 0 start
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U') {
				count++;
			}
		}
		System.out.println("String :"+str);
		System.out.println("Vowel :"+count);
	}*/

	
	//accept input from user.........
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Username :");
		String str=sc.nextLine();
		System.out.println("Username :"+str);
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);   //count index by 0 start
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ||
				ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U') {
				count++;
			}
		}
		System.out.println("Vowel :"+count);
		
	}
}
