package staticKeyword;

public class StaticMethod {
	
	
	public static void staticMethod() {
		System.out.println("I am a static method..");
	}
	
	public void nonStaticMethod() {
		System.out.println("I am a Non-Static method....");
	}
	
	//main method
	public static void main(String[] args) {
		
		StaticMethod.staticMethod();   // use without creating object,no object required
		
		StaticMethod obj = new StaticMethod();
		obj.nonStaticMethod();  //we need to create object ,call object required
	
	}
}
