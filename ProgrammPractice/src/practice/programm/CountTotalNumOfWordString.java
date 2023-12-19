package practice.programm;

import java.util.Scanner;

public class CountTotalNumOfWordString {

	public static void main(String[] args) {
		String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	str = sc.nextLine();
	int i, count=1;
	
	for(i=0; i<str.length(); i++) {
		
		if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') 
			count = count + 1;
		
		
	}
	System.out.println("Total Word:" + count);
	}

}
