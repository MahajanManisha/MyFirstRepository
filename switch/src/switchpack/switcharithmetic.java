
// create simple calculator (Switch statement support addition , multiplication, 
//  substraction, Division ,modulo) 
package switchpack;

public class switcharithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=5;
		switch('*')
		{
		    case '+': 
		    	System.out.println("Addition is " +(a+b));
		    break; 	

		    case '*': 
		    	System.out.println("Multiplication is " +(a*b));
		    break; 	

		    case '-': 
		    	System.out.println("Substraction is " +(a-b));
		    break; 	

		    case '/': 
		    	System.out.println("Division is " +(a/b));
		    break; 	

		    case '%': 
		    	System.out.println("Modulo is " +(a%b));
		    break; 	
		}

	}

}
/* Output
    Division is 4
*/