
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
         //sleepIn(false, false) → true 
         //sleepIn(true, false) → false 
         //sleepIn(false, true) → true


package com.warmup1;
public class SleepIn {

	public static boolean sleepIn(boolean Weekday , boolean Vacation) {
		return ! Weekday || Vacation;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sleepIn(false,false));
		System.out.println(sleepIn(true,false));
		System.out.println(sleepIn(false,true));
	}
}
