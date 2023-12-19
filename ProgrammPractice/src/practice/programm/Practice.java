package practice.programm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
//		
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		System.out.println("list is "+list);
//	
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(list);
	List<Integer> list1=list.stream().filter(num->num%2==0).collect(Collectors.toList());
	List<Integer> list2=list.stream().filter(num->num%2!=0).collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(list2);
		
		
//		TreeSet<Integer> treeList = new TreeSet();
//		treeList.add(1);
//		treeList.add(4);
//		treeList.add(2);
//		treeList.add(3);
//		treeList.add(0);
//		System.out.println(treeList);
		
//		HashMap<Integer, String> hashlist = new HashMap<>();
//		hashlist.put(1, "Vaibhavi");
//		hashlist.put(2, "Pallavi");
//		hashlist.put(3, "Divya");
//		hashlist.put(1, "Vaibhavi");
//		hashlist.put(2, "Vaibhavi");
//		System.out.println(hashlist);
		
//		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);		
//		
//		//System.out.println(list);
//		
//		List<Integer> resultList= list.stream().map(num->num+4).collect(Collectors.toList());
//		System.out.println(resultList);
//		
//		
		
		
		
	}

}


