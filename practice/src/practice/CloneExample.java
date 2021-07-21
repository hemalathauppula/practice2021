package practice;

class Student1 implements Cloneable 
{
	 private int id;
	 private String name;
	 
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
	
	
	 
}

public class CloneExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		Student1 s1=new Student1(1,"Hema");
		
		System.out.println(s1.getId());
		
		Student1 s2=(Student1) s1.clone();
		
		s1.setId(1101);
		s2.setId(22);
		System.out.println(s1.getId());
		System.out.println(s2.getId());
	}

}
