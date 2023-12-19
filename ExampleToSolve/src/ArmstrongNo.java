import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int num = sc.nextInt();
		int rem=0, sum=0;
		int n = num;
		
		for(int i=0; i<num; i++) {
		while(num>0) {
			rem = num%10;
			sum = sum +(rem*rem*rem);
			num = num/10;
		}
		if(n==sum) {
			System.out.println("The no is Armstrong");
		}
		else {
			System.out.println("The num is not Armstrong");
		}
		}
		
	}

}
