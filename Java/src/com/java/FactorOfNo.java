package com.java;

import java.util.Scanner;

public class FactorOfNo {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter No:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			if(n%i==0) {
				
				System.out.print(i + " ");
			}
		}
	}

}
