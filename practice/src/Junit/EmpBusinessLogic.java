package Junit;

public class EmpBusinessLogic {
	public double calculateYearlySalary(EmployeeDetails em)
	{
		double yearsalary=em.getSalary();
		return yearsalary*12;
	}
	
	public double calculateAppraisal(EmployeeDetails em)
	{
		double appraisal=0;
		
		if(em.getSalary()>10000)
			appraisal=1000;
		else
			appraisal=500;
			
		return appraisal;
	}

}
