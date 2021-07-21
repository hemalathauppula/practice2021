package Junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result r=JUnitCore.runClasses(JunitAnnotation.class);
		for (Failure failure : r.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(r.wasSuccessful());

	}

}
