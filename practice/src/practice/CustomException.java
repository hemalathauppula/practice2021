package practice;

class invalidAgeException extends Exception
{
	invalidAgeException(String s)
	{
		super(s);
	}
	
}

public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			validate(20);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}
		

	}

	 static void validate(int i) throws invalidAgeException {
		// TODO Auto-generated method stub
		 if(i<18)  
		      throw new invalidAgeException("not valid");  
		     else  
		      System.out.println("welcome to vote");
		
	}

}
