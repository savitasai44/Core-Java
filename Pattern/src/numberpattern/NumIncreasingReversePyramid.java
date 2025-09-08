
//This is a reverse pyramid where each row starts from 1 and ends at the row count,
//in decreasing number of elements
// Java Program to print pattern Number-increasing reverse pyramid

package com.numberpattern;
public class NumIncreasingReversePyramid {

	public static void main(String[] args) {
		
		System.out.println("Column wise...");
		for(int i=6; i>=1; i--) {
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("Row wise.....");
		for(int i=6; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}
}
