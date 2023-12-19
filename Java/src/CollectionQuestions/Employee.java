package CollectionQuestions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {

	public int id;
	public String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
	List<Employee> empList = List.of(
			
			new Employee(1,"neha"),
			new Employee(1,"shreya"));
	
	Map<Integer, String>result=empList.stream()
	
	
	
	
	
//	Map<Integer, String>EmployeeMap = empList.stream().collect(Collectors.toMap(Employee::getId(), Employee->employee));
//	System.out.println(employeeMap.getId(1).getName());
//			
	
}
