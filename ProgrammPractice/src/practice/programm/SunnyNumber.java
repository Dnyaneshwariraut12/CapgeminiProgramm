package practice.programm;

import java.util.Scanner;

public class SunnyNumber {

		public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();

		isSunnyNumber(N);
		}

		static boolean findPerfectSquare(double num){
		  
		double square_root = Math.sqrt(num);

		return(square_root-Math.floor(square_root)==0);

		}
		static void isSunnyNumber(int N){
		if(findPerfectSquare(N+1))
				{
		System.out.println("number is sunny");
		}
		else{
		System.out.println("Number is not sunny");
		}
		
 }
}
