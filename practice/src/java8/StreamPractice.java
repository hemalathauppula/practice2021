package java8;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Stream<String> s=Stream.of("uppula","hema","latha");
		 * s.forEach(System.out::println);
		 * 
		 * String str[]=new String[] {"uppula","hema","latha"};
		 * 
		 * Stream<String> s2=Arrays.stream(str,1,3); s2.forEach(System.out::println);
		 * 
		 * Stream<String> streamGenerated = Stream.generate(() -> "element").limit(10);
		 * 
		 * streamGenerated.forEach(System.out::println);
		 * 
		 * Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5);
		 * 
		 * streamIterated.forEach(System.out::println);
		 */
		
		
		Stream<String> stream = 
				  Stream.of("a", "b", "c").filter(element -> element.contains("b"));
				Optional<String> anyElement = stream.findAny();
				
				System.out.println(anyElement.isEmpty());
	}

}
