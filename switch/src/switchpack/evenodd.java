// program to check is even or odd using switch stmt.
package switchpack;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=21;
		System.out.println(+no);
		System.out.println("Even and odd numer");
		switch(no%2)
		{
		case 0: 
			System.out.println( "Number is even " +no);
			break;
		case 1:
			System.out.println("Number is odd " +no);
		    break;
		}

	}

}
/* Output
Number is odd 21
*/