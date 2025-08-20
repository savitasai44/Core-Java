package Level2Moderatetask;

import java.util.Scanner;

public class CountSpecialCharacter {
	/*public static void main(String[] args) {
		String username="Krush@88";
		int specialChar=0;
		for(int i=0;i<username.length();i++) {
			char ch=username.charAt(i);
			if(!(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')  && !(ch>='0' && ch<='9')) {
				specialChar++;
			}
		 }
		System.out.println("Username :"+username);
		System.out.println("Special Symbol :"+specialChar);
	}*/
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter username:");
		String username=scan.nextLine();
		int specialChar=0;
		for(int i=0;i<username.length();i++) {
			char ch=username.charAt(i);
			if(!(ch>='a' && ch<='z') && !(ch>='A' && ch<='Z')  && !(ch>='0' && ch<='9')) {
				specialChar++;
			}
		 }
		System.out.println("Username :"+username);
		System.out.println("Special Symbol :"+specialChar);
		
	}

}
