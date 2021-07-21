package collections;
import java.util.*;

public class ListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ArrayList<String> al=new ArrayList<String>(); al.add("Uppula");
		 * al.add("Hema"); al.add("latha");
		 * 
		 * System.out.println(al);
		 * 
		 * //String s[]=new String[al.size()];
		 * 
		 * //s=(String[]) al.toArray(); String s[]=al.toArray(new String[al.size()]);
		 * 
		 * for(String temp:s) { System.out.println(temp); }
		 */
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		System.out.println(al);
		
		Integer arr[]=al.toArray(new Integer[al.size()]);
		
		

	}

}
