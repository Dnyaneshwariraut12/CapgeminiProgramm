package practice.programm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class checkVowelsConsonant {

	public static void main(String[] args) {
	
  //Counter variable to store the count of vowels and consonant 
   int vCount=0 , cCount=0;
   
   //Declare a string    
   String s = "This is a really simple sentence";
   
   //Converting entire string to lower case to reduce the comparisons  
   s = s.toLowerCase();
   
   for(int i=0; i<s.length(); i++) {
	   
	   //Checks whether a character is a vowel    
	   if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
		   
		   vCount++;
	   }
	   
	   //Increments the consonant counter   
	   else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
		   
		   cCount++;
	   }
   }
   System.out.println("The no of Vowels is:" + vCount);
   System.out.println("The no of Consonant is:" + cCount);
	
	}
}

