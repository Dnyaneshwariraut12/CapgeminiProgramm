import java.util.Scanner;

public class CheckTFirstTwoCharacterPresentAtEnd {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("enter string");
	        String n=sc.next();
	        if(n.substring(0,2).equals(n.substring(n.length()-2, n.length())))
	{

	     System.out.println("The first two characters in "+n+ " appear in the  last is same");

	}
	        else
	        {
	             System.out.println("The first two characters in "+n+ " appear in the  last is not  same");
	        }

	}

}
