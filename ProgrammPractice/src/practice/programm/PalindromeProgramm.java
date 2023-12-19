package practice.programm;

public class PalindromeProgramm {

	public static void main(String[] args) {
		int num = 789;
		int rev = 0;
		int temp =num;
		while(num != 0) {
			int remainder = num %10;
			rev = rev * 10 + remainder;
			num = num/10;
		}
		System.out.println(rev);
		
		if(temp == rev) {
			System.out.println("Number is palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}

	}
		
	

}
