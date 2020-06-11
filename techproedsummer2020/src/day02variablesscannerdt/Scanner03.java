package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a square
         whose side length is entered by user.
         Hint 1: Area of a square is length x length
         Hint 2: Perimeter of a square is 4 x length
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side lenght of the square ");
		double sideLength = scan.nextDouble();
		System.out.println("The area is " + (sideLength*sideLength));
		System.out.println("The perimeter is " + (sideLength*4));
		scan.close();

	}

}
