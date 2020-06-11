package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a rectangle
         whose length and with are entered by user.
         Hint 1: Area of a rectangle is width x length
         Hint 2: Perimeter of a rectangle is 2x(width + length)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length and the width of the rectangle ");
		double length = scan.nextDouble();
		double width = scan.nextDouble();
		double area = length*width;
		double perimeter = 2*length+2*width;
		System.out.println("The area of the rectangle is " + area);
		System.out.println("The perimeter of the rectangle is " + perimeter);
		scan.close();
	}

}
