package placement;

import java.util.Scanner;

public class ArmstrongNum {
	
	public static void main(String[] args) {
		
		/*int num=153;
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int digit=num%10;        //extraction the number
			sum=sum+digit*digit*digit;       //bulid armstrong number
			num=num/10;                    //remove last number
			
		}
		
		if(temp==sum) {
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("NOT armstrong number");
		}  */
		
		
		     Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ?");
		int num=sc.nextInt();
		System.out.println(num);
		
		int temp=num;
		int sum=0;
		
		while(num>0) {
			int digit=num%10;                 //extraction of number
			sum=sum+digit*digit*digit;
			num=num/10;                      //last number remove
			
		}
		
		if(temp==sum) {
			System.out.println("armstrong number");
		}
		else
			
		{
			System.out.println("NOT armstrong number");
		}
		  
		sc.close();
		
		
		
		//without loop...
		
  /*		     int num=153;
		int temp=num;
		int sum=0;
		
		int n1=num%10;   // extrection number
		num=num/10;                  //remove last digit
		
		int n2=num%10;   // extrection number
		num=num/10;                  //remove last digit
		
		
		int n3=num%10;   // extrection number
		
		 sum=n1*n1*n1+n2*n2*n2+n3*n3*n3;
		
		if(temp==sum) {
			System.out.println("armstong number");
		}
		else
		{
			System.out.println("NOT armstong number");
		} */
		
		
	}

}
