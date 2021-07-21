package collections;
import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<Integer> al=new ArrayList<Integer>();
      for(int i=0;i<10;i++)
      {
    	  al.add(i);
      }
      
      System.out.println(al);
		/*
		 * for(int i:al) System.out.println(i);
		 * 
		 * Iterator itr=al.iterator(); while(itr.hasNext()) {
		 * System.out.print(itr.next()); } int[] arr=new int[al.size()]; for(int
		 * j=0;j<arr.length;j++) { arr[j]=al.get(j); }
		 * 
		 * for(int i:arr) System.out.println(i);
		 */
       
        if(al.contains(7))
        	System.out.println("Element found");
        
        al.remove(4);
        
        System.out.println(al);
      }

}
