package day04operatorsifstatementdt;

import java.util.Scanner;

public class Operators02 {

	public static void main(String[] args) {
		/*Ask user to enter two integer values. 
		 *  Write a Java Program to swap
		 *  two numbers by using the third variable.
		 *  a=3, b=5 after swapping a=5, b=3
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c;
		System.out.println("Before swapping a, b:"+a+", "+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping the values a, b:"+a+", "+b);
		scan.close();
	}

}
