
// Java Program to print pattern Number triangle pattern
//Prints a right-angled triangle with numbers in increasing
//row order, aligned to the right.
package com.numberpattern;
public class NumberTrianglePatetrn {

	public static void main(String[] args) {
		
		int n=6;
		
        // outer loop to handle number of rows
		for(int i=1; i<=n; i++) {
			
            // inner loop to print space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
            // inner loop to print star
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			
            // print new line for each row
          System.out.println();

		}
		
		
	}
}
