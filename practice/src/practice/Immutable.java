package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

final class ImmutableClass
{
	 private final int id;
	 private final String name;
	 private final HashMap<Integer,String> testMap;
	 ImmutableClass(int id,String name,HashMap<Integer,String> tm)
	 {
		 this.id=id;
		 this.name=name;
		//his.testMap=tm;
		HashMap<Integer,String> temp=new LinkedHashMap<Integer,String>();
		Set<Integer> s=tm.keySet();
		
		for(Integer x:s)
		{
			temp.put(x, tm.get(x));
		}
	
		this.testMap=temp;
		
		
		 
	 }
	 
	 public int getId()
	 {
		 return id;
	 }
	 
	 public String getName()
	 {
		 return name;
	 }
	 public HashMap<Integer,String> getTestMap()
	 {
		//ystem.out.println(testMap);
		 
		return  (HashMap<Integer, String>) testMap.clone();
		 
	 }
	 
	 
	 
	
}
public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> testMap=new LinkedHashMap<Integer,String>();
		testMap.put(1, "one");
		testMap.put(2, "two");
		
		System.out.println(testMap);
		ImmutableClass obj=new ImmutableClass(1,"Hema",testMap);
		
		
		  System.out.println(obj.getId()); System.out.println(obj.getName());
		  System.out.println(obj.getTestMap());
		  
		  testMap.put(3, "three");		
	//ystem.out.println(obj.getTestMap());
		
		System.out.println(obj.getTestMap());
		
		

	}

}
