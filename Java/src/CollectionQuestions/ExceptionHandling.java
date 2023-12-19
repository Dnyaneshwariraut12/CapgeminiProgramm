package CollectionQuestions;

public class ExceptionHandling {

    public static void validateName(String name) throws EmployeeNameNotValidException{
        if(name==null || name.length()<1) {
            throw new EmployeeNameNotValidException();
        }
    }

 
    
    public static void main(String[] args) {
        String name = "";


 

        try {
            validateName(name);
            System.out.println("Employee name is valid.");
        } catch (EmployeeNameNotValidException e) {
            System.out.println("Employee name is not valid: " + e.getMessage());
        }
    }

 

}

class EmployeeNameNotValidException extends Exception{

    public EmployeeNameNotValidException(){
        super("Employee name not valid");
    }    
}

