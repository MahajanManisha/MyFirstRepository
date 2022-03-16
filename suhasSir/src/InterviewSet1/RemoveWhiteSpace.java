package InterviewSet1;
import java.io.*;
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java is object oriented progammig language";
		/*for(int i=0;i>str.length();i++)
		{
			char c=str.charAt(i);
			if(c=='')
			{
				str.replaceAll(" ", "");
			}
		}*/
		System.out.println("Removing sapce " +str.replaceAll(" ", ""));
	}
	

}
