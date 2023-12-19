package practice.programm;

import java.util.Scanner;

public class CountNumberOfWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println(" enter name");

		 

		String st=sc.nextLine();

		System.out.println("char :");

		char c=sc.next().charAt(0);

		int count=0;

		for(int i=0;i<st.length();i++)

		{

		if(st.charAt(i)==c)

		count++;

		}

		System.out.println(count);

		
	}

}
