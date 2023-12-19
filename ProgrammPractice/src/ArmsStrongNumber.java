import java.util.Scanner;

public class ArmsStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:"); 
		int num = sc.nextInt();
		int n=num;
		int sum=0; int rem=0;
		for(int i=0; i<num; i++) {
		while(num>0) {
			rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
			if(n==sum) {
				System.out.println("The no is ArmsStrong");
				
			}
			else
			{
				System.out.println("The no is not ArmsStrong");
				
			}
		}
		

	}
	
	}
