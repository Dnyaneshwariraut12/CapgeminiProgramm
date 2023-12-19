package com.java;

public class FindSubStringPresentInFirst {

	public static void main(String[] args) {
		
//		 Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.
//
//		 Input the first string: 
//		  Java
//		 Input the second string: 
//		  Ja
//		 Check first string contains letters from the second string:
//		 true

		
		System.out.println(isSubstring("java","av"));

	}

	private static boolean isSubstring(String main, String sub) {
		
		return main.matches("(.*)" + sub  + "(.*)");
	}

}
