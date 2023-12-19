package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

	public static void main(String[] args) {
	
//		List <Integer> list = Arrays.asList(33,12,45, 38,99,101);
//		List<Integer> p1 = list.stream()
//		.filter(n-> n%2==0)
//		.forEach(System.out::println);
//		.collect(Collectors.toList());
//		System.out.println(p1);
		
		List<Integer> list = Arrays.asList(33,12,45, 38,99,101);
		list.stream()
		.filter(n-> n%2==0)
		.forEach(System.out::println);
		
	}
}
