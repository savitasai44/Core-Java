
//Given two int values, return their sum. 
//Unless the two values are the same, then return double their sum.
             //sumDouble(1, 2) → 3
             //sumDouble(3, 2) → 5
             //sumDouble(2, 2) → 8

/*Logic:जर a != b असेल → फक्त a + b परत कर.
     जर a == b असेल → मग (a + b) * 2 परत कर.*/

package com.warmup1;
public class SumDouble {
	
	public static int sumDouble(int a, int b) {
		if(a==b) {
			return a+b*2;
		}
		else {
			return a+b;
		}
	}
	public static void main(String[] args) {
		System.out.println(sumDouble(1,2));
		System.out.println(sumDouble(3,2));
		System.out.println(sumDouble(2,2));
	}

}
