package practice.programm;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the no:");
		
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();  //
		int temp=0;
		
		for(int i=2; i<=no-1; i++) {   //check i divisible by from 2 to n-1// ie no is 7 then it check 2 to 6
			
			if(no%i==0) {
				
				temp = temp+1; //it is temp variable because cant write syso here because if we write here then its print so many time
				
			}
		}
		if(temp>0) {
			
			System.out.println(no + " is not prime no");
			
		}
		else {
			
			System.out.println(no + " is prime no");
			
		}
		
	}
}

