


package Level2Moderatetask;
import java.util.Scanner;
public class CountNumberOfConsonants {
	/*public static void main(String[] args) {
		String str="Savita";
		int cons=0;
		for( int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
				if(ch>='a' && ch<='z'  ||  ch>='A' && ch<='Z') {
					if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
							ch!='A' && ch!='E' && ch!='O' && ch!='I' && ch!='U') {
						cons++;
				}
			}
		}
		System.out.println("String :"+str);
		System.out.println("Consonants :"+cons);
	}*/

	
	
	//accept iput from user...........
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the username :");
		String str= sc.nextLine();
		System.out.println("Username :"+str);
		int cons=0;
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(ch>='a' && ch<='z'  || ch>='A' && ch<='Z') {
				if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' &&
						ch!='A' && ch!='E' && ch!='O' && ch!='I' && ch!='U') {
					cons++;
      			}
			}
		}
		System.out.println("Consonants :"+cons);
	}
}
