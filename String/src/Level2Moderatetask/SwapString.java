package Level2Moderatetask;

public class SwapString {

	 public static void main(String[] args) {
	        String s1 = "Hello";
	        String s2 = "World";

	        System.out.println("Before Swap: s1 = " + s1 + ", s2 = " + s2);

	        // Step 1: Combine both
	        s1 = s1 + s2;   // "HelloWorld"

	        // Step 2: Extract original s1 into s2
	        s2 = s1.substring(0, s1.length() - s2.length());

	        // Step 3: Extract original s2 into s1
	        s1 = s1.substring(s2.length());

	        System.out.println("After Swap: s1 = " + s1 + ", s2 = " + s2);
	    }
}
