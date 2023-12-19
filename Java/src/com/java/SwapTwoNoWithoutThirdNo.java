package com.java;

import java.util.Scanner;

public class SwapTwoNoWithoutThirdNo {

	public static void main(String[] args) {
		
		// Swapped two No Without Using Third No
		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two No:");
		a = sc.nextInt();   //10
		b = sc.nextInt();   //20
		
		System.out.println("Before Swapping: " + a + " " + b);  //10 20
		
		a = a+b;  // a = 10+20 =30 
		b = a-b;  // b = 30-20 = 10
		a = a-b;  // a = 30-10 =20
		
		System.out.println("After Swapping: " + a + " " + b); // 20 10
		

	}

}
