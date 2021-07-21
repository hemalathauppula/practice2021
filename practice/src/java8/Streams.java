package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=Arrays.asList(2,3,4,5,6,11,15,21,2,5);
		//l.stream().filter(n->n%2==0).forEach(System.out::println);
		//l.stream().map(n->n+"").filter(n->n.startsWith("1")).forEach(System.out::println);
       // Set<Integer> h=new HashSet<Integer>();
        
       // l.stream().filter(n->!h.add(n)).forEach(System.out::println);
		
		//l.stream().findFirst().ifPresent(System.out::println);
		
		//int x1=l.stream().findFirst().get();
		
		//System.out.println(x1);
		
		long x2=l.stream().max(Integer::compare).get();
		System.out.println(x2);
	}

}
