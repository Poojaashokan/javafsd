
public class SleepWait {
	  private static Object obj = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(100);
	        System.out.println("Thread" + Thread.currentThread().getName() + " is woken after sleeping for 0.1 second");
	        synchronized (obj) 
	        {
	            obj.wait(100);
	            System.out.println("Object" + obj +  "is woken after" + " waiting for 0.1 second");
	        }
	    }
	}


