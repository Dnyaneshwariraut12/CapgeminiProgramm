import java.util.Scanner;

public class CountNoOfVowelsConsonant {

	public static void main(String[] args) {
	
		int vCount=0, cCount=0; int i;
		
		String str = "hello";
		str = str.toLowerCase();
		
		for(i=0; i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
					str.charAt(i)=='o'||str.charAt(i)=='u') {
			
			vCount++;
		}
		else if(str.charAt(i)>='a'&& str.charAt(i)<='z') {
			
			cCount++;
		}
		}
		
		System.out.println("The vowels are:" + vCount);
		System.out.println("The consonant are:" + cCount);

	}

	}
