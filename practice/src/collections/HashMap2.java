package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbccdddeee";
		HashMap<Character,Integer> hm=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(hm.containsKey(s.charAt(i)))
			{
				hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
			}
			else
				hm.put(s.charAt(i), 1);
		}
		
		System.out.println(hm);

	}

}
