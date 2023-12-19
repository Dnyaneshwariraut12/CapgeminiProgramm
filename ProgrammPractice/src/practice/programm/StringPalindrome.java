package practice.programm;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "madam";
		int length = str.length();
		String rev = "";
		
		for(int i=length-1; i>=0; i--) {
			
			rev = rev + str.charAt(i);
			
		}
		//System.out.println(rev);
		
		if(str.equals(rev)) {
			
			System.out.println("String is palindrome");
		}
		
		else {
			
			System.out.println("String is not palindrome");
		}
	}

}
