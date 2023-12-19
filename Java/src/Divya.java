import java.util.ArrayList;

public class Divya{
	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList<>();
		list.add("d");
		list.add("q");
		list.add("f");
		list.add("g");
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("e");
		list2.add("u");
		list2.add("o");
		list2.add("p");
		System.out.println(list2);
	
		ArrayList<String> join_list = new ArrayList<>();
		join_list.addAll(list);
		join_list.addAll(list2);
		System.out.println(join_list);
		
	}
}