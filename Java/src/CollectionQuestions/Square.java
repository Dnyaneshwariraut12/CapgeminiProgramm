package CollectionQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square {

	public static void main(String[] args) {
		
	List<Integer>number = Arrays.asList(3,4,6,2,5,2,3,7,9);
		
		number.stream().filter(n->n%2!=0).map(n->(long)n*n).collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

}
