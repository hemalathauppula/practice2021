package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	private int id;
	private String name;
	Student(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
	
}


public class SerialazationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			Student s1=new Student(1,"hema");
			FileOutputStream f=new FileOutputStream("f.txt");
			ObjectOutputStream o=new ObjectOutputStream(f);
			o.writeObject(s1);
			o.flush();
			o.close();
			System.out.println("success");
			
			ObjectInputStream oin=new ObjectInputStream(new FileInputStream("f.txt"));
			Student temp=(Student) oin.readObject();
			System.out.println(temp.getId());
			
			
			System.out.println(temp.getName());
			
			oin.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
