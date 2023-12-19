package CollectionQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingNo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,3,20);
		Collections.sort(list);
		
		for(int i=0; i<list.get(list.size()-1); i++) {
			if(list.contains(i)) {
				continue;
			}
			else {
				System.out.print(i+ " ");
			}
		}
		

	}

	
}
