package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee>{
    
	private int id;
	private String name;
	private int age;
	private long salary;
		// Constructor and other methods


	// Implement the compareTo method for sorting by salary in descending order
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


//
	
	

	public static void main(String[] args) {
		
	List<Employee> emp = new ArrayList<Employee>();
	
	    emp.add(new Employee(1, "Ajay",30, 40000));
	    emp.add(new Employee(2, "Vijay",25,25000));
	    emp.add(new Employee(3, "Rahul",23,20000));
	    emp.add(new Employee(40,"Pramod",29,50000));
	  

	    
//	    List < Employee > employeesSortedList1 = emp.stream()
//	            .sorted((o1, o2) -> (int)(o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
//	        System.out.println(employeesSortedList1);

	        List < Employee > employeesSortedList2 = emp.stream()
	            .sorted(new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						
						return (int)(o1.getSalary() - o2.getSalary());
					}
            
	          
	            }).collect(Collectors.toList());
	
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}





}

	