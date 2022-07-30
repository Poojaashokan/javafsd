
public class ThreadMain extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("Thread starts running");
	}
	 	public static void main( String args[] )
	 	{
	  		ThreadMain t = new  ThreadMain();
	  		t.start();
	 	}
	}



