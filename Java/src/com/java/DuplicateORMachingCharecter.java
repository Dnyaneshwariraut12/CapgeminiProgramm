package com.java;

public class DuplicateORMachingCharecter {

	public static void main(String[] args) {
	
		//How to get matching characters in a string.
	    
		String str = "Abbccfegg";
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					
					System.out.println("Duplicate character are:" + str.charAt(j));
				
					break;
				}
			}
		}
		
	}

}
