package com.java;

import java.util.Scanner;

public class RemovedSpecificWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		
		String text = sc.nextLine();
		System.out.println("Enter word to remove:");
		String word = sc.nextLine();
		
		System.out.println("new String , after removing the word: \n" + test(text,word) );
		
		
		
		

	}

	private static String test(String text, String word) {
		
		return text.replace(word," ").replace(" ", " ");
	}

}
