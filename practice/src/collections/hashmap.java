package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(5,"Hema");
        hm.put(3,"latha");
        hm.put(1,"uppula");
        hm.put(4,"Hema");
        
        
		/*
		 * Set<Integer> s=hm.keySet();
		 * 
		 * ArrayList<String> s2=(ArrayList<String>) hm.values();
		 * 
		 * System.out.println(s2);
		 * 
		 * for(Integer k:s) { System.out.println(k+" "+hm.get(k)); }
		 */
        
        List<Entry<Integer, String>> listOfEntry = new LinkedList<>(hm.entrySet());
        
        Collections.sort(listOfEntry, new Comparator<Entry<Integer, String>>() 
        {
            public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) 
            {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        
        Map<Integer, String> sortedIdNameMap = new LinkedHashMap<Integer, String>();
        
        for (Entry<Integer, String> entry : listOfEntry) 
        {
            sortedIdNameMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println(sortedIdNameMap);
	}

}
