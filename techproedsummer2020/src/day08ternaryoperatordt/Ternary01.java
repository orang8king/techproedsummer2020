package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary01 {
	public static void main(String[] args) {
		//Ask user to enter an integer
		//If the integer is bigger than 10 print "Good" otherwise "Bad"
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int y = scan.nextInt();
		
		if(y>10) {
			System.out.println("Good");
		}else {
			System.out.println("Bad");
		}
		scan.close();
		//2. Way: Use Ternary Operator to solve
		String x = y>10 ? "Good" : "Bad";
		System.out.println(x);
		
	}
}
