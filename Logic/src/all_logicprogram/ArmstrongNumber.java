package all_logicprogram;



public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int rem=num%10;
			 sum=rem*rem*rem+sum;
			 num=num/10;
			 
			
		}
		if(sum==temp) {
			System.out.println("Armstrong number ...");
		}
		else {
			System.out.println("NOT Armstrong number......");
		}
		
		
	}

}
