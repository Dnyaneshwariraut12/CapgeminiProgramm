import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
     	Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year:");
		int year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.println(year+ " leap Year");
		}
		else
		{
			System.out.println(year+" Not leap Year");
		}
	}
}


