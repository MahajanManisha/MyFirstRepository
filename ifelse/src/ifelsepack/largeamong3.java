//assignment no. 4 in ifelse
//Check the largest among the three numbers 
package ifelsepack;

public class largeamong3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=200,b=40,c=90;
      if(a>b)
      {
    	  if(a>c)
    	  {
    		  System.out.println("  a is greater number between three number " +a);
    	  }
      }
      else
      {
    	  if(b>c)
    	  {
    		  System.out.println(" b is greater number between three number " +b);
    	  }
    	  else
    	  {
    		  System.out.println("c is greater number between three number " +c);
    	  }
      }
	}

}
/* Output
a is greater number between three number 200
*/
