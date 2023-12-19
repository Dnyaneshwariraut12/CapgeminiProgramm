package com.java;

public class RotationString {

	public static void main(String[] args) {
		
		System.out.println(isRotatedVersion("abcd" , "bcda"));
			
		
		

	}

	private static boolean isRotatedVersion(String str, String rotatedString) {
		
		boolean isRotated = false;
		
		if(str ==null || rotatedString==null) {
			
			return false;
			
		}else if(str.length()!= rotatedString.length())
		{
			return false;
			
		}
		else {
			
			String concanated = str + str;
			return concanated.contains(rotatedString);
			
		}
		
		
	}

	
}
