package InterviewSet1;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=obj.nextInt();
		int flag=1;
		for(int i=1;i<a/2;i++)
		{
			if(a%2==0)
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}
	}

}
