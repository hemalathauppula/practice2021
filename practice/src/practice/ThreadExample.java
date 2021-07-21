package practice;

public class ThreadExample implements Runnable {

	public void run()
	{
		System.out.println("Thread execution");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread ib=new Thread(new ThreadExample());
		ib.start();

	}

}
