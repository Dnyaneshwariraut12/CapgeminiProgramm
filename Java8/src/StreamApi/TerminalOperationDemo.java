package StreamApi;

import java.util.Arrays;
import java.util.List;

public class TerminalOperationDemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
//		Object[] arr = list.stream().toArray(); //convert to array
//		System.out.println(arr[1]);
//		
//		System.out.println(list.stream().count()); //count the element
		
		list.stream().reduce(0,(x,y)-> (x+y));
		System.out.println(list.stream().reduce(0,(x,y)-> (x+y))); //reduce for sum
		
		
//		list.stream().forEach(System.out::println);// forEach for print each element one by one
		
		//list.stream().forEachOrdered(System.out::println);// the data print in order
		
		
		//System.out.println(list.stream().min((a,b)->a-b));
	}

}
