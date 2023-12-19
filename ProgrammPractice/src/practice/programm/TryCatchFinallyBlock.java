package practice.programm;

public class TryCatchFinallyBlock {

	public static void main(String[] args) {
		
		try {
			int a=100, b=0,c;  //it contain risky code
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)   //handle the exception
		{
			System.out.println(e);
			
			
		}
		finally {
			System.out.println("I am finally block");   //it always execute //cleanup the code //close the connection
			
		}
		System.out.println("gg");
	}

}
