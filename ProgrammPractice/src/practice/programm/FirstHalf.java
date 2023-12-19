package practice.programm;

public class FirstHalf {

	public static void main(String[] args) {
	
		System.out.println(firsthalf("WooHoo"));
		System.out.println(firsthalf("HelloThere"));
		System.out.println(firsthalf("abcdef"));
		
	}

	private static String firsthalf(String str) {
		
		return str.substring(0, str.length()/2);
	}

}
