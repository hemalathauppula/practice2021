package practice;

class Parent
{
	 int num=1;
	Parent()
	{
		System.out.println("Default const of Parent");
	}
	Parent(String s)
	{
		System.out.println("Parameterized const of Parent"+s);
	}
	public void foo()
	{
		System.out.println("Display method of Parent");
	}
}
class Child extends Parent
{
	private int num=5;
	Child()
	{
		super();
		//super("hema");
		System.out.println("Default const of Child");
		
	}
	public void printNum()
	{
		System.out.println("child number:"+num);
		System.out.println("num of super: "+super.num);
		
	}
	
	public void foo()
	{
		System.out.println("Display method of child");
		super.foo();
	}
	  
}
public class SuperPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c=new Child();
		c.printNum();
		c.foo();

	}

}
