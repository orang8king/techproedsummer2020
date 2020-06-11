package day09nestedternarydt;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 Type code which types “even” for even integers, and “odd” for 
		 odd integers on console. Use if else if and switch
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Even number");
		}else if(num%2!=0) {
			System.out.println("Odd number");
		}else {
			System.out.println("Nothing");
		}
		int result=num%2;
	switch(result) {		
		case 0:
			System.out.println("Even number");
			break;
		case 1:
			System.out.println("Odd number");
			break;
		
		default:
			System.out.println("Enter a valid number");
		}
	scan.close();
	}

}
