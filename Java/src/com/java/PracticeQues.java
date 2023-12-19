package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PracticeQues {
	
	public static void main(String [] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No");
		int n =sc.nextInt();
		int num=n, sum=0, rem;
		for(int i=0; i<num;i++) {
		while(n>0) {
			rem=num%10;
			sum = sum+(rem*rem*rem);
			num = num/10;
		}
		}
		if(n==sum) {
			System.out.println("A");
		}
		else {
			System.out.println("B");
		}

	}

} 
