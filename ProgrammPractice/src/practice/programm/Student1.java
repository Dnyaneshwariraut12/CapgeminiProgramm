package practice.programm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//EXAMPLE of Comparator Interface//

public class Student1{
	int rollNo;
	String name;
	int age;
	


	
	public Student1(int rollNo, String name, int age) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	

static class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.Age==s2.Age)
		return 0;
		else if(s1.Age>s2.Age)
			return 1;
		else 
			return -1;
	}
	
}
 static class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
		
	}
	
}


	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 21));
		al.add(new Student(102,"Swati",24));
		al.add(new Student(104,"tina",32));
		
		
		System.out.println("Sorted by Age:" );
	
		
		Collections.sort(al,new AgeComparator());
		
		for(Student st:al)
		{
			System.out.println(st.RollNo + " " + st.name + " " + st.Age);
		
		}
		
        System.out.println("Sorting By Name: ");
		
		Collections.sort(al,new NameComparator());
		
		for(Student st:al) 
		{
			System.out.println(st.RollNo + " " + st.name + " " + st.Age);
		}
	}
  
	}

