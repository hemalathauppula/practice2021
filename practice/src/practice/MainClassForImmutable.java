package practice;

public class MainClassForImmutable {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee(1,"Hema",new Address("warangal","telangana"));
		Address ad=emp.getAddress();
		
		
		
		System.out.println(ad);
		
		System.out.println(emp.getId()+emp.getName()+emp.getAddress());
		
		ad.setCity("hyderabad");

System.out.println(ad);
		
		System.out.println(emp.getId()+emp.getName()+emp.getAddress());
	}

}
