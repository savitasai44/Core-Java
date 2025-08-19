package Level1Basicstask;

public class CompareString {
	public static void main(String[] args) {
		String s1="Java";
		String s2="java";
		if(s1.equals(s2)) {        //case-sensitive
			System.out.println("Equal");
		}else {
			System.out.println("NOT equal");
		}
		if(s1.equalsIgnoreCase(s2)) {          //ignore case-sensitive
			System.out.println("Equal");
		}else {
			System.out.println("NOT equal");
		}
	}

}
