import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String st = sc.nextLine();
		
		HashSet<Character> unique = new HashSet<>();
		
		for(int i=0; i<st.length(); i++) {
			
			char ch = st.charAt(i);
			
			if(unique.contains(ch)==true) {
				unique.remove(ch);
			}
			else 
				unique.add(ch);		
	}
		
		if(unique.size()==0) {
			System.out.println("There is no unique character");
		}
		for(Character ch:unique) {
			System.out.print(" " + ch + " ");
		
		}
	}

}
