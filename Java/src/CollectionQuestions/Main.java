package CollectionQuestions;

public class Main {

	
	    public void validateEmployeeName(String name) throws EmployeeNameNotValidException {
	        if (name == null || name.trim().isEmpty()) {
	            throw new EmployeeNameNotValidException();
	        }
	    }
	}


	


