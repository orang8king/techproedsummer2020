package day02variablesscannerdt;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// Scanner class is used to get data from user
		//To get data we have 3 steps
		
		//1. Step
		Scanner scan = new Scanner(System.in);
		
		//2. Step 
		System.out.println("Please, put an integer");
		
		//3. Step
		int num = scan.nextInt();
		System.out.println(num);
		scan.close();
		
	}

}
