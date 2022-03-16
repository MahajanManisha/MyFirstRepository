package InterviewSet1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=obj.nextInt();
		int temp=a;
		//using for loop
		int sum=0,rem=0;
		/*for(;a!=0;)
		{
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}*/
		//using while
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem*rem*rem;
			a=a/10;
		}
		if(temp==sum)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
	}

}
