
/*Given an int n, return the absolute difference between n and 21,
  except return double the absolute difference if n is over 21.
                diff21(19) → 2
                diff21(10) → 11
                diff21(21) → 0
                diff21(25) → 8
 
 Logic:जर n <= 21 → 21 - n परत कर.
       जर n > 21 → (n - 21) * 2 परत कर.
 */


package com.warmup1;
public class Diff21 {
	
	public static int diff21(int n) {
		if(n<=21) {
			return 21-n;
		}else {
			return( n-21)*2;
		}
	}
	public static void main(String[] args) {
		
	    System.out.println(diff21(19)); // 2
        System.out.println(diff21(10)); // 11
        System.out.println(diff21(21)); // 0
        System.out.println(diff21(25)); // 8
	}

}
