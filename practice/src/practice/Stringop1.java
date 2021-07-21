package practice;

import java.util.HashSet;

public class Stringop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Hema is good girl is is hema".toLowerCase();
		//s.toLowerCase();
		System.out.println(s);
		String str[]=s.split(" ");
		//System.out.println(str[1]);
		
		HashSet<String> h1=new HashSet<String>();
		HashSet<String> h2=new HashSet<String>();
		
		for(String temp:str)
		{
			if(!h1.add(temp))
			{
				h2.add(temp);
			}
				
		}
		
		System.out.println(h2);
		
		
			
			
		
			
		
		
		
	}

}
