package practice.programm;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class MissingNum1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,30,3);
		Collections.sort(list);
		for(int i=1; i<list.get(list.size()-1); i++ ) {
			if(list.contains(i)) {
				continue;
			}
			else {
				System.out.print(i +" ");
			}
		}
	}

}
