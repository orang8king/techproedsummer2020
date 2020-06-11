package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement01 {

	public static void main(String[] args) {
		//User enter an integer
		//if it is less than 10 print you won!
		//Otherwise print you lost
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int a = scan.nextInt();
		
		if (a<10) {
			System.out.println("You won!");
		} else {
			System.out.println("You lost because you are a loser :)");
		}
		System.out.println("The end of the program");
		
		//1. Way Solve the question just by using if statement
		
		if (a<10) {
			System.out.println("You won!");
		}
		if (a>=10) {
			System.out.println("You lost because you are a loser :)");
		}
		scan.close();
	}

}
