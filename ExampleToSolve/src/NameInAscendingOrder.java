import java.util.Arrays;
import java.util.Scanner;

public class NameInAscendingOrder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = sc.nextLine().toLowerCase();
		char ch[] = str.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(ch);

	}

}