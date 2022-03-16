package InterviewSet1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveduplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(30);
		System.out.println(li);
		HashSet<Integer> hash=new HashSet<Integer>(li);
		System.out.println(hash);
		List<Integer> li11=new ArrayList<Integer>(hash);
		System.out.println(li11);
	}

}
