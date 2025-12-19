package placement;

import java.util.Scanner;

public class ReverseAstring {
	
	public static void main (String args[]) {
	
	/*	String str="java";   //initialize a string
		String rev=" ";               //empty string to store the string result
		
		for(int i=str.length()-1; i>=0; i--) {   //using a for loop last to first character 
			rev=rev+str.charAt(i);    //get each character 
			
		}
		System.out.println(rev);    //print the reverse string
		
		
		*/
		
		
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb.reverse());
		
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Check if original string and reversed string are same
        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        sc.close();
	}
}
