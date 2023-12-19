package CollectionQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ACS","EPAM","ERR","TCS");
		
		list.stream().map(word->new StringBuilder(word).reverse())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

	
}
