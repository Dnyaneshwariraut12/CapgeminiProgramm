import java.util.Scanner;

public class CapitalizeFirstAndLastLetter {


	void capitalize(String str) {
		str = str.trim()+" ";
		str= str.toLowerCase();
		String word = "";
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isWhitespace(ch)) {
				
				String word1 ="";
				for(int j=0; j<word.length(); j++) {
					char ch1 = str.charAt(j);
					if(j==0||j==word.length()-1) {
						ch1 = Character.toUpperCase(ch1);
					}
					word1 = word1 + ch1;
				}
				System.out.println(word1 + " ");
				word = "";
			}else {
				word = word + ch; //java
			}
		}
	}

	public static void main(String[] args) {
		CapitalizeFirstAndLastLetter obj = new CapitalizeFirstAndLastLetter ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		String str = sc.nextLine();//java programming
		obj.capitalize(str);
			}

}
