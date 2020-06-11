package day04operatorsifstatementdt;

import java.util.Scanner;

public class Operators03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter two numbers and 
		 swap the numbers
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two integers to swap:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping a, b:"+a+" "+b);
		scan.close();
		
	}
}
