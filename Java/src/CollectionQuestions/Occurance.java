package CollectionQuestions;

import java.util.Map;
import java.util.TreeMap;

public class Occurance {

	public static void main(String[] args) {
		
		String sc  = "Capgemini";
	
		    sc = sc.replace(" ", " ");
		    char arr[] = sc.toCharArray();
		    
		    int count =0;
		    Map<Character,Integer> map = new TreeMap<>();
		    for(int i=0; i<arr.length; i++) {
		    	count = 0;
		    	for(int j=0; j<arr.length; j++) {
		    		
		    		if(arr[i]==arr[j]) {
		    			count++;
		    		}
		    	}
		    	map.put(arr[i], count);
		    }
		    System.out.println(map);
				
	}

}
