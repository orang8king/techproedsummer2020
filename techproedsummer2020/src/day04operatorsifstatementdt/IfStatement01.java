package day04operatorsifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*
		Get an integer from user, if the integer is positive print pos
		if it is negative print negative
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number and I will tell you if it is + or -");
		int num = scan.nextInt();
		if (num>0) {
			System.out.println("The number is positive");
		}
		if (num<0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("You did not enter a positive or negative number");
		}
		scan.close();
	}
}
