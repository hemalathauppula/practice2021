package practice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProdCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockingQueue<String> q=new ArrayBlockingQueue<>(5);
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		Thread producerThread = new Thread(p);
		Thread consumerThread = new Thread(c);
		
		producerThread.start();
		consumerThread.start();
		

	}
	
	static class Producer implements Runnable
	{

		private BlockingQueue q=null;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				System.out.println("Producing element 1");
				q.put(1);
			    Thread.sleep(1000);
			    System.out.println("Producing element 2");
				q.put(2);
			    Thread.sleep(1000);
			    System.out.println("Producing element 3");
				q.put(3);
			    
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		Producer(BlockingQueue q)
		{
			this.q=q;
		}
		
	}
	static class Consumer implements Runnable
	{

		private BlockingQueue q=null;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true)
			{
				try
				{
					System.out.println("Consuming: "+q.take());
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			
		}
		Consumer(BlockingQueue q)
		{
			this.q=q;
		}
		
	}
	

}
