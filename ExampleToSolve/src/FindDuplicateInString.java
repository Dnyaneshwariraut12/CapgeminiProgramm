import java.util.Scanner;

public class FindDuplicateInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		int count;
		
		char[]ch = str.toCharArray();
		
		for(int i=0;i<str.length(); i++) {
			count=1;
			for(int j=0; j<str.length();j++) {
				
				if(str.charAt(i)==str.charAt(j)){
				System.out.println(count);
				count++;
				break;

				}
				
			}
			
		}
		
	}

}
