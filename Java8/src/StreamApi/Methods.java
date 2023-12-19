package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		
		//filter(predicate)
		//Its return boolean value function
		
		//map(Function)
		/*
		each element operation 
		 */

		
		List<String> names = List.of("Aman", "Ankit","Abhinav");
		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newNames);
		
		List<Integer> numbers = List.of(23,4,2,5,7,8);
		List<Integer> newNumbers = numbers.stream().map(i -> i * i ).collect(Collectors.toList());
		System.out.println(newNumbers);
		
		
		
	}

}
