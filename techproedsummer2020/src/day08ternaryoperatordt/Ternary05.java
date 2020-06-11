package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary05 {
	public static void main(String[] args) {
		/*
		Ask user to enter an integer and then check if it has 3 digits.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		String num = scan.next();
		
		String result = num.length()==3 ? "This number has 3 digits" : "This number has no 3 digits";
		System.out.println(result);
		scan.close();	
	}
}
