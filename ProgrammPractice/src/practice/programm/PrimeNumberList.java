package practice.programm;

public class PrimeNumberList {

	public static void main(String[] args) {
		
		String s="JAva";
		String rev =" ";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i); // rev =a, a+v, a+v+A , a+v+A+J
		}
System.out.println(rev);
	}

}
