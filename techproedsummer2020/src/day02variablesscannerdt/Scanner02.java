package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// Get two integers from user
		//Print their addition on the console
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		//2. Step
		//type syso and do control space and it will complete system out println
		System.out.println("Enter two integers to add ");
		//3. Step
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("The sum is " + (num1+num2));
		System.out.println("The product is " + (num1*num2));
		System.out.println("The division is " + (num1/num2));
		scan.close();
	}
	

}
