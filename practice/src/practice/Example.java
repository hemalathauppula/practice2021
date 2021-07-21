package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1=new Thread();
		Thread t2=new Thread();
		Thread t3=t1;
		
		System.out.println(t1==t3);
		System.out.println(t1==t2);
		System.out.println(t1.equals(t2));
		
		String s1=new String("Hema");
		String s2=new String("Hema");
		
		System.out.println(s1==s2);
		
		List<Integer> l1=Arrays.asList(1,2,3,1,2,3);
		
		List<Integer> l2=l1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(l2);
		
		
		
		
		
		

	}

}
