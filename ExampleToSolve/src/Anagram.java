import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println(isAnagram("listen","silent"));

	}

	private static boolean isAnagram(String str1, String str2) {
		
		String s1 = str1.replace("\\s", "");
		String s2 = str2.replace("\\s", "");
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		else {
		char c1[] = str1.toCharArray();
		char c2[] = str2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
		}
		
	}

}
