package com.alphabetspattern;

public class RightTriangle {
	    public static void main(String[] args) {
	        int n = 5; // rows
	        for (int i = 0; i < n; i++) {
	            char ch = 'A';
	            for (int j = 0; j <= i; j++) {
	                System.out.print(ch + " ");
	                ch++;
	            }
	            System.out.println();
	        }
	    }

}
