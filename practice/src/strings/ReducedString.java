package strings;

import java.util.Arrays;
import java.util.List;

public class ReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabcdd";
		//List l=Arrays.asList(s);
		StringBuffer s1=new StringBuffer(s);
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(i+1))
			{
				s1.delete(i, i+2);
			}
		}
		System.out.println(s1);

	}
	
	

}
