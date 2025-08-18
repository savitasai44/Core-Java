
//java program to use static block is executed before main method. 
//If we declare a Static block in java class it is executed when class loads.


package staticKeyword;

public class StaticBlock {
    //static int num=10;
	 static {
		System.out.println("static block executed.");
	}
	//public static void display() {
	//	System.out.println(num);}	}
	public static void main(String[] args) {
		//StaticBlock.display();
	}
}
