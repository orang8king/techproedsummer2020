package day09nestedternarydt;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		/*
		 Use switch statement
		 Ask user to enter the name of a month
		 The program should print the number of month
		 For example March ==> 3, June ==> 6
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the month");
		String month = scan.next().toUpperCase();
		switch(month) {
			case"JANUARY":
				System.out.println(month + "==> 1");
				break;
			case"FEBRUARY":
				System.out.println(month + "==> 2");
				break;
			case"MARCH":
				System.out.println(month + "==> 3");
				break;
			case"APRIL":
				System.out.println(month + "==> 4");
				break;
			case"MAY":
				System.out.println(month + "==> 5");
				break;
			case"JUNE":
				System.out.println(month + "==> 6");
				break;
			case"JULY":
				System.out.println(month + "==> 7");
				break;
			case"AUGUST":
				System.out.println(month + "==> 8");
				break;	
			case"SEPTEMBER":
				System.out.println(month + "==> 9");
				break;	
			case"OCTOBER":
				System.out.println(month + "==> 10");
				break;	
			case"NOVEMBER":
				System.out.println(month + "==> 11");
				break;	
			case"DECEMBER":
				System.out.println(month + "==> 12");
				break;	
			default:
				System.out.println("You did not enter a month");
				scan.close();
		}
	}

}
