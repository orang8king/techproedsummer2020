package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary04 {
	public static void main(String[] args) {
		/*
		 Ask user to enter a string.
		 If the String has 2 characters, output will "It is valid for state abbreviations"
		 Otherwise, output will be "It is not valid for state abbreviation"
		 */
		
		//To get the number of characters in a String we will use length() method,
		//length() method returns integer
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a word");
		//.toUpperCase makes the String upper case. There is also .toLowerCase
		String word = scan.next().toUpperCase();
		int length = word.length();
		if(length==2) {
			System.out.println("It is valid for state abbreviations");	
		}else {
			System.out.println("It is not valid for state abbreviations");
		}
		System.out.println((length==2)?"It is valid for state abbreviations":"It is not valid for state abbreviations");
		scan.close();
	}
}
