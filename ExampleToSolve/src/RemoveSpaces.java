
public class RemoveSpaces {

	public static void main(String[] args) {
		
		String str = "I am Living in Mumbai";
		
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
