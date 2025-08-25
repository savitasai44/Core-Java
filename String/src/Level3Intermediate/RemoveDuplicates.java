
//Remove Duplicate Characters from a string 

package Level3Intermediate;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	 public static void main(String[] args) {
	       /* String str = "programming";
	        String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);

	            // If not already in result, add it
	            if (result.indexOf(c) == -1) {
	                result = result + c;
	            }
	        }

	        System.out.println("Original: " + str);
	        System.out.println("Without Duplicates: " + result);
	    }*/
	 
	 
	 
	 String str = "programming";
     LinkedHashSet<Character> set = new LinkedHashSet<>();

     for (char c : str.toCharArray()) {
         set.add(c);
     }

     StringBuilder result = new StringBuilder();
     for (char c : set) {
         result.append(c);
     }

     System.out.println("Without Duplicates: " + result);
 }
}
