
abstract class Bank {
	
abstract int getRateOfInterest();

}
class SBI extends Bank{

	@Override
	int getRateOfInterest() {
	
		return 7;
	}
}
	class HDFC extends Bank{

		@Override
		int getRateOfInterest() {
			
			return 8;
		}
		
	}
	
class Test{
	
	public static void main(String[] args) {
		
		Bank b;
		b = new SBI();
		System.out.println("The rate of interest is:" + b);
		b= new HDFC ();
		System.out.println("The rate of interest is:" + b);
	
	}

}

