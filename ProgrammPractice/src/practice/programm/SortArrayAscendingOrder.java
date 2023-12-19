package practice.programm;

import java.util.Arrays;

public class SortArrayAscendingOrder {

	public static void main(String[] args) {
		String[] s = {"Capgemini", "Accenture", "TCS", "EPAM"};
		Arrays.sort(s); // Sort the array in ascending alphabetical order

		System.out.println("Sorted array:");

		for (String str : s) {

		System.out.println(str);

		}
	}

}
/*String[] s = {"Capgemini", "Accenture", "TCS", "EPAM"};



List<String> list = new ArrayList<>(Arrays.asList(s));

Collections.sort(list);

 

System.out.println("Sorted array (Method 2):");

for (String str : list) {

System.out.println(str)

 

 

 

String[] s = {"Capgemini", "Accenture", "TCS", "EPAM"};

 

Arrays.stream(s)

.sorted()

.forEach(System.out::println);

};

 

*

* String[] s = {"Capgemini", "Accenture", "TCS", "EPAM"};

 

TreeSet<String> sortedSet = new TreeSet<>();

for (String str : s) {

sortedSet.add(str);

}

 

System.out.println("Sorted array (Method 5):");

for (String str : sortedSet) {

System.out.println(str)*/

