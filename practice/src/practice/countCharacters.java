package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class countCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "bcdabcdababcdaac";

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char[] c = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (hm.containsKey(c[i])) {
				hm.put(c[i], hm.get(c[i]) + 1);
			} else
				hm.put(c[i], 1);
		}

		System.out.println(hm);
		/*
		 * int x=Collections.max(hm.values()); System.out.println(x);
		 * 
		 * System.out.println(hm.containsValue(x)); hm.g
		 */
		
		Set<Character> k=hm.keySet();
		Collection<Integer> v=hm.values();
		
		TreeMap<Integer,Character> ts=new TreeMap<Integer,Character>();
		
		
	
		

	}

}
