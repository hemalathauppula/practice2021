package Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
	
	EmployeeDetails empObj=new EmployeeDetails();
	EmpBusinessLogic empb=new EmpBusinessLogic();
	
	@Test
	public void testCalculateAppriasal()
	{
		empObj.setAge(25);
		empObj.setName("Hema");
		empObj.setSalary(20000.00);
		
		double appraisal=empb.calculateAppraisal(empObj);
		assertEquals(1000.0,appraisal,0.0);
		
	}
	@Test
	public void testCalculateYearlySalary()
	{
		empObj.setAge(25);
		empObj.setName("Hema");
		empObj.setSalary(20000.00);
		
		double yearlysalary=empb.calculateYearlySalary(empObj);
		assertEquals(240000.0,yearlysalary,0.0);
		
	}

}
