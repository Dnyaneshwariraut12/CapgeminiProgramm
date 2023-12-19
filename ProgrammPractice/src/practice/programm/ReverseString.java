package practice.programm;

public class ReverseString {

	public static void main(String[] args) {
		
		//1. By using +( string concatanation )operator
		
		String str= "ABCD";
		String rev="";
	/*	int len=  str.length();//4
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);//3 2 1 0
		}
		System.out.println("Reverse string is:" + rev);//D C B A */
		
		//Using character array
		
		char a[]=str.toCharArray();
		int len =a.length;//
		for(int i=len-1; i>=0; i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
		
	}

		
	
	
}
