
public class LengthOfString {

	public static void main(String[] args) {
		
		String s = "Hello";
		int i=0;
		
		for(char ch : s.toCharArray()) {
			i++;
		}
		System.out.println("Length of String is: " + i);
	}

}
