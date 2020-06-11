package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		// User enters a char
		// If the char is same with your initial of your first name
		// Print "You got it on the console"
		//Otherwise print try again
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Guess the first initial of my name");
		char firstInitialOfMyName = scan.nextLine().charAt(0);
		
		if(firstInitialOfMyName=='S') {
			System.out.println("You got it");
		} else {
			System.out.println("Try again");
		}
		scan.close();

	}

}
