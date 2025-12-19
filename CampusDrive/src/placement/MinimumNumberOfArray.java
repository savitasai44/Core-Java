package placement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumNumberOfArray {
	
	public static void main(String args[]) {
	Scanner sc= new Scanner (System.in);
	
	int num[]=new int[6];
	int min=0;
	
     for(int i=0; i<num.length; i++) {
    	 System.out.println("enter the array element");
    	 num[i]=sc.nextInt();
    	 
    	 if(num[i]<min) {
    		 min=num[i];
    	 }
    	 
     }
	
     System.out.println(Arrays.toString(num));
     System.out.println(min);
     
     sc.close();
}

}	
	