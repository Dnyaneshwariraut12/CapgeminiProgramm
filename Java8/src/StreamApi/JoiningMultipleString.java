package StreamApi;

import java.util.StringJoiner;

public class JoiningMultipleString {
	
   //Explain StringJoiner Class in Java 8? How can we achieve joining multiple Strings
	//using StringJoiner Class?
	
	public static void main(String[] args) {
	
		StringJoiner joinName = new StringJoiner("," , "[","]"); //passing comma as delimiter to separate the character
		
		joinName.add("Ravi");
		joinName.add("Pallavi");
		joinName.add("Ravi");
		System.out.println(joinName); 
		
	}

	
}
