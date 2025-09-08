package com.numberpattern;

public class NumIncreasingPyramidPattern {
	
	public static void main(String[] args) {
		
        // outer loop to handle number of rows
		for(int i=1; i<=6; i++) {
			
            // inner loop to handle number of columns
			for(int j=1; j<=i; j++){
				
		// printing column values upto the row value
				System.out.print(j+" ");
			}   //inner loop end
			
            // print new line for each row
			System.out.println();
		}                  //outer loop end
		
		
		System.out.println("Row wise....");
		for(int i=0; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
