package practice;
class Singleton1
{
	
	private static Singleton1 singletonInstance=null;
	public String s;
	
	private Singleton1()
	{
		s="hema is good girl";
	}
	public static Singleton1 getInstance()
	{
		if(singletonInstance==null)
			singletonInstance=new Singleton1();
		
		return singletonInstance;
	}
}
  public class Singleton {
	
	public static void main(String args[])
	{
		Singleton1 x=Singleton1.getInstance();
		Singleton1 y=Singleton1.getInstance();
		Singleton1 z=Singleton1.getInstance();
		x.s=(x.s).toUpperCase();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s);
		
		z.s=(z.s).toLowerCase();
		
		System.out.println(x.s);
		System.out.println(y.s);
		System.out.println(z.s); 
		
		
	}
	
	

}
