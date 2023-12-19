package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenationOfTwoStream {

	public static void main(String[] args) {
	
		List<String> list1 = Arrays.asList("java","8");
		List<String> list2 = Arrays.asList("explain","through", "program");
		
		Stream<String> concatStream = Stream.concat(list1.stream(), list2.stream());
		
		 concatStream.forEach(str -&gt; System.out.print(str + " "));
		

	}

}
