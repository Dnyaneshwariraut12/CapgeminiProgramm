import java.util.Scanner;

public class CheckReverseOrNot {

	public static void main(String[] args) {

	String str1 ="eabc"; String str2 = "cbae";
	System.out.println(isReversed(str1, str2));
	}
		
	public static boolean isReversed(String str1, String str2) {
	 
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
			for(int i=0; i<str1.length(); i++) {
				if(str1.charAt(i)!=str2.charAt(str2.length()-i-1)) {
				return false;	
				}
			}
		return true;
		
		

		}
	
	}

}
