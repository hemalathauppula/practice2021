package practice;

class PrintOddEven implements Runnable
{
	private int rem;
	
	public int MAX_NUMBER =10;
    static int  number=1;
    
    static Object lock=new Object();
    
    
	PrintOddEven(int rem)
	{
		this.rem=rem;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(number<MAX_NUMBER)
		{
			synchronized(lock)
			{
				while(number%2!=rem)
				{
					try
					{
						lock.wait();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
			}
		}
		
	}
}
public class ThreadPractice {
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PrintOddEven oddRunnable=new PrintOddEven(1);
        PrintOddEven evenRunnable=new PrintOddEven(0);
 
        Thread t1=new Thread(oddRunnable,"T1");
        Thread t2=new Thread(evenRunnable,"T2");
 
        t1.start();
        t2.start();
		
	}

	

}
