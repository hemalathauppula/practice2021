package collections;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "uppula");
		hm.put(2, "hema");
		hm.put(3, "latha");
		
		//HashMap<Integer,String> sormap=new LinkedHashMap<>(hm.entrySet());
		
		List<Entry<Integer,String>> l=new LinkedList<>(hm.entrySet());
		Collections.sort(l,new Comparator<Entry<Integer,String>>() 
		{
				@Override
				public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
					// TODO Auto-generated method stub
					return o1.getValue().compareTo(o2.getValue());
				}
		 }
				);
		
		HashMap<Integer,String> sm=new LinkedHashMap<Integer,String>();
		for(Entry<Integer,String> e:l)
		{
			sm.put(e.getKey(), e.getValue());
		}
		
		System.out.println(sm);
		
		HashMap<Integer,String> sm2=hm.entrySet().stream().
				sorted(Entry.comparingByValue((o1,o2)->o1.length()-o2.length())).
				collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(sm2);
		
		
		

	}

}
