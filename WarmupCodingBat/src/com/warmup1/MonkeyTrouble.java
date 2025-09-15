
//We have two monkeys, aSmile and bSmile.
//We are in trouble if both monkeys are smiling or neither is smiling.
//Return true if we are in trouble.
           //monkeyTrouble(true, true) → true
           //monkeyTrouble(false, false) → true
           //monkeyTrouble(true, false) → false
//logic :जर दोन्ही समान असतील (दोघे हसत आहेत किंवा दोघे नाही), तर trouble आहे

package com.warmup1;
public class MonkeyTrouble {
	
	public static boolean monkeyTrouble(boolean aSmile , boolean bSmile) {
		return (aSmile==bSmile);
		
	}
	public static void main(String[] args) {
		
		System.out.println(monkeyTrouble(true,true));
		System.out.println(monkeyTrouble(false,false));
	    System.out.println(monkeyTrouble(true,false));
	}
	

}
