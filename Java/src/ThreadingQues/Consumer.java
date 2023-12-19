package ThreadingQues;

public class Consumer extends Thread {
	  
	public Company c;

	   

	    public Consumer(Company c) {
	        this.c = c;
	    }

	 

	    public void run() {
	        while (true) {
	            try {
	                c.consumNumber();
	            } catch (InterruptedException e1) {
	                // TODO Auto-generated catch block
	                e1.printStackTrace();
	            }
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	    }
}