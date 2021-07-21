package strings;

import java.util.Arrays;
import java.util.Collections;



public class Anargams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a="hello";
       String b="olleh";
       char ac[]=a.toCharArray();
       char bc[]=b.toCharArray();
      
       //Boolean r=false;
       String result;
       if(a.length()==b.length())
       {
    	  Arrays.sort(ac);
    	 
    	  Arrays.sort(bc);
    	 
    	  if(Arrays.equals(ac, bc))
    	  {
    		 
    		  result="Anagrams"; 
    	  }
    	  else
    		  result="Not Anagrams";
    	   
       }
       else
       {
    	    result="Not Anagrams";
       }
       
       System.out.println(result);
       
	}

}
