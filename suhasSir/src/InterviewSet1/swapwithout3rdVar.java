package InterviewSet1;

import java.util.Scanner;

public class swapwithout3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=obj.nextInt();
		System.out.println("Enter the 2nd number");
		int b=obj.nextInt();
		System.out.println("Before the swapping the value a is "+a );
		System.out.println("Before the swapping the value b is "+b );
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After the swapping the value a is "+a );
		System.out.println("After the swapping the value b is "+b );
		
	}

}
