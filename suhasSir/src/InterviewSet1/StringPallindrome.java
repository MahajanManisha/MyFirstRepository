package InterviewSet1;
import java.lang.System;
public class StringPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Manisha";
		String m="";
		/*for(int i=0;i<str.length();i++)
		{
			
			m=str.charAt(i)+m;
		}*/
		int i=0;
		while(i<str.length())
		{
			m=str.charAt(i)+m;
			i++;
		}
		System.out.println("String m is " +m);
		if(str.equalsIgnoreCase(m))
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
		
		
	}

}
