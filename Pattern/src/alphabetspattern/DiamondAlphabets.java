package com.alphabetspattern;

public class DiamondAlphabets {
	    public static void main(String[] args) {
	        int n = 5;  // किती rows (A ते E)

	        // Upper Half
	        for (int i = 0; i < n; i++) {
	            // spaces
	            for (int j = n - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            // alphabets
	            char ch = (char) ('A' + i);
	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }

	        // Lower Half
	        for (int i = n - 2; i >= 0; i--) {
	            // spaces
	            for (int j = n - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            // alphabets
	            char ch = (char) ('A' + i);
	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	            }
	            System.out.println();
	        }
	    }
}
