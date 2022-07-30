

	public class RunnableThread implements Runnable {  
		    
	    public void run() {  
	        System.out.println("Thread has ended");  
	    }  
	   
	    public static void main(String[] args) {  
	        RunnableThread r = new RunnableThread();  
	        Thread t= new Thread(r);  
	        t.start();  
	        System.out.println("Implementing runnable interface");  
	    }  
	}  


