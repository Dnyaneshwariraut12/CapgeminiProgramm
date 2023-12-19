
public class Power {

	public static void main(String[] args) {
		
		int n=3;
		int rem=1;
		int power=3;
		while(power!=0) {
			 rem = rem*n;
			 power--;
		}
		System.out.println(rem);
	}

}
