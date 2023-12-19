import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ParticularCharacterRepeated {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String:");
		String str = sc.nextLine().toLowerCase();
		str = str.replace("", "");
		char arr[]=str.toCharArray();
		
		Map<Character, Integer> map = new TreeMap<>();
		for(int i=0; i<str.length(); i++) {
			int count =0;
			for(int j=0; j<str.length(); j++) {
				
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);
		}
		System.out.println(map);

	}

}
