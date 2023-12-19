package StreamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class LengthGreaterThan {

	// Write a Java 8 program to find the number of Strings in a list whose length is greater
	// than 5?
	public static void main(String[] args) {
		
		String[] nameArray = new String[]{"Divya", "Pallavi", "Vaibhavi","Shashwati"};
		
		Stream <String> stream = Arrays.stream(nameArray);
		Stream<String>filterStream = stream.filter(name-> name.length()>5);
		String[]filteredNameArray = filterStream.toArray(String[]::new);
		
		for(String name:filteredNameArray) {
			System.out.println(name);
		}
		

	}

}
