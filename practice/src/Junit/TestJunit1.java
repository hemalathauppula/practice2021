package Junit;
import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestJunit1 extends TestCase{
	
	   String message = "Robert";	
	   int num=5;
	   String temp=null;
	   
	   @Test
	   public void testAdd() {	
	     
	      assertEquals("Robert", message);  
	      assertFalse(num>6);
	      assertTrue(num==5);
	      assertNull(temp);
	      System.out.println("No of Test Case = "+ this.countTestCases());
	   }
	  

}
