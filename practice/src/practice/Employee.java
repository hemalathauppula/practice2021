package practice;

final public class Employee {
	
	final private int id;
	final private String name;
	final private Address address;
	
	Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public Address getAddress()throws CloneNotSupportedException
	{
		return (Address) address.clone();
	}
	
	

}
