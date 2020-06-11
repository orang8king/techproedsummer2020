package day05ifelsestatementdt;

import java.util.Scanner;

public class HomeworkQuestion01 {

	public static void main(String[] args) {
		/*
		 Ask user ta enter a 4 digits integer, 
		 then print the sum of the first  and the 
		 last digit of the number on the console. 
		 For example; if user enters 1234 you will add 1 and 4,  
		 then print on the console 5
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 4 digit number");
		int a = scan.nextInt();
		
		int lastDigit = a % 10;
		System.out.println("The last digit of your number is: "+lastDigit);
		//If you wanna get the first digit of a 4 digits number
		//divide the number by 1000. As you see, for 4 digits we are using
		//3 zeros. If the number has 5 digits you need 4 zeros
		int firstDigit = a / 1000;
		System.out.println("The first digit of your number is: " + firstDigit);
		
		System.out.println("The sum of first and last digit of your number is: " + lastDigit + firstDigit);
		scan.close();
	}

}
