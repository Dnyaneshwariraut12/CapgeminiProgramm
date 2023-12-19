package StreamApi;

public class CreateThreadLambdaEX {

	public static void main(String[] args) {
		
		Runnable myThread = ()->{
			
			Thread.currentThread().setName("MyThread");
			System.out.println(Thread.currentThread().getName() + " is running");
		};
		
		
			Thread run = new Thread(myThread);
			run.start();
		
	}

}
