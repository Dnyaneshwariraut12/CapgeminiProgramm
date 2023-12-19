package com.java;

import java.util.Scanner;

public class MagicNoOrNot {

	public static void main(String[] args) {
		int num, temp,rem, sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:");
		num = sc.nextInt();
		 temp = num;
		 
		while(temp>9) {
			
			sum=0;
			while(temp!=0) {
				rem = temp%10;
				sum  = sum+rem;
				temp= temp/10;
				
				
			}
			temp = sum;
		}
		if(sum==1) {
			System.out.println("No is Magic");
		}else {
			System.out.println("No is not Magic");
		}
	}

}
