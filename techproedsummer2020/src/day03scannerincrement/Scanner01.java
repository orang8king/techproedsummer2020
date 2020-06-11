package day03scannerincrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// How to get string from user

		//1. Step
		
		Scanner scan = new Scanner(System.in);
		//2. Step
		System.out.println("Please enter your name");
		//3. Step
		//for String you can use nextLine(return everything) or next(just gets the first word)
		String fullName = scan.next();
		System.out.println(fullName);
		scan.close();
	}

}
