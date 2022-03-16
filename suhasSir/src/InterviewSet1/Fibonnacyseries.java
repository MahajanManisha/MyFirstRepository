package InterviewSet1;

import java.util.Scanner;

public class Fibonnacyseries {

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a=0;
		int b=1;
		int temp;
		System.out.println("Enetr the lilit");
		int n=obj.nextInt();
		System.out.println(+a);
		System.out.println(+b);
		//Using For loop
		/*for(int i=3;i<=n;i++)
		{
			temp=a+b;
			System.out.println(+temp);
			a=b;
			b=temp;
		}*/
		int i=3;
		while(i<=n)
		{
			temp=a+b;
			System.out.println(+temp);
			a=b;
			b=temp;
			i++;
		}
	}
}
