package practice.programm;

public class ReplaceWithStarORhypen {

	public static void main(String[] args) {
		String str1 = "Javatpoint";
		String str2 = " ";
		
		str2 = str1.replaceAll("[aeiou]", "*");
		System.out.println(str2);
	}

}
