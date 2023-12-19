package practice.programm;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountCharacters {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    s = s.replace(" ", " ");
    char arr[] = s.toCharArray();
    
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
