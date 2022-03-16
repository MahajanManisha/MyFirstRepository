package InterviewSet1;

public class duplictaecharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="Java is object oriented programming lang";
    int cnt;
    char m[]=str.toCharArray();
    for(int i=0;i<m.length;i++)
    {
    	cnt=1;
    	for(int j=i+1;j<m.length;j++)
    	{
    		if(m[i]==m[j] && m[i]!='0' )
    		{
    	      cnt++;	
    	     m[j]='0';
    		}
    	
        }
    	if(cnt>1 && m[i]!='0')
    	{
    		System.out.println(m[i]+" Repeated " +cnt +" Time");
    		
    	}
	}

	}
}
	
