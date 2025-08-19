package Level1Basicstask;

import java.util.Scanner;

public class ConcatenateString {
	/*public static void main(String[] args) {
		String s1="savi";
		String s2=" java Developer......";
		System.out.println(s1+s2);   //using the + operator
		System.out.println(s1.concat(s2));           //without +Operator using concat method
	}*/
	//accept input from user......
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter  String:");
		String str1=sc.nextLine();
		System.out.println("Enter another String :");
		String str2=sc.nextLine();
		System.out.println("Concatnation a String :"+str1.concat(str2));
	}

}
