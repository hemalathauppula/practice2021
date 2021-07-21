package collections;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll=new ArrayList<Integer>();
     for(int i=0;i<10;i=i+2)
     {
    	 if(i%2!=0)
    	 {
    		 ll.add(i);
    	 }
     }
     
     System.out.println(ll);
	}

}
