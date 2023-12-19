package practice.programm;

import java.util.ArrayList;
import java.util.Collections;

//EXAMPLE of Comparable Interface//

public class Student implements Comparable<Student>{
	int RollNo;
	String name;
	int Age;
	

	public Student(int rollNo, String name, int age) {
		super();
		RollNo = rollNo;
		this.name = name;
		Age = age;
	}

	@Override
	public int compareTo(Student st) {
		
		if(Age==st.Age)
			
		return 0;
		
		else if(Age>st.Age)

		return 1;
		
		else
			return -1;
		
	}
	
      public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 21));
		al.add(new Student(102,"Swati",24));
		al.add(new Student(104,"tina",32));
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.RollNo + " " + st.name + " " + st.Age);
		}
	
	}
	

}
