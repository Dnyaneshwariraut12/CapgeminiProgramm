package StreamApi;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstNonRepeated {

	public static void main(String[] args) {
	
		String str = "Java articles are Awesome";
		
		Character result = str.chars()
		.mapToObj(s-> Character.toLowerCase(Character.valueOf((char) s)))
	    .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()))
	    .entrySet()
	    .stream()
	    .filter(entry ->entry.getValue()==1)
	    .map(entry-> entry.getKey())
	    .findFirst()
	    .get();
	   System.out.println(result);

	}

}
