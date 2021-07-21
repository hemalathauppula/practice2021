package practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> a=new HashSet<String>()
				{
			{
				add("hema");
				add("latha");
				add("uppula");
				
			}
				};
				
				System.out.println(a);
				
				Iterator itr=a.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}

	}

}
