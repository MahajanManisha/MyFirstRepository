//Assignment no. 3 in if else
//Check whether year is leap or not
package ifelsepack;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year =2022;
        if(year%400==0)
        {
        	System.out.println(+ year +" is leap year");
        }
        else
        	if(year%100==0)
           {
            System.out.println(+ year +" is not leap year");
           }    
        	else
        		{
        		     if(year%4==0)
        		     {
        		    	 System.out.println(+ year +" is leap year");
                     }
        		     else 
        		     {
        		    	 System.out.println(+ year +" is not leap year");
        		     }
        		}     
	}

}
/* output
   2022 is not leap year
*/