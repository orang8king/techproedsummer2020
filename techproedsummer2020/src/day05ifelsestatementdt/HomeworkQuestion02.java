package day05ifelsestatementdt;

import java.util.Scanner;

public class HomeworkQuestion02 {

	public static void main(String[] args) {
		/*
		 Type java code by using if statement. 
		 When you enter the initial of the day of a week,
		 output should be all possible names of the days.
		 For example; if the initial is ’S’ output should be 
		 “Saturday or Sunday”
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial of a day in uppercases");
		//To get char from user you have to use nextLine().charAt(0)
		char initialOfDay = scan.nextLine().charAt(0);
		
		if(initialOfDay=='S') {
			System.out.println("It is either Saturday or Sunday");	
		}
		
		if(initialOfDay=='M') {
			System.out.println("It is Monday");
		}
		
		if(initialOfDay=='T') {
			System.out.println("It is either Tuesday or Thursday");
		}
		
		if(initialOfDay=='W') {
			System.out.println("It is Wednesday");
		}
		
		if(initialOfDay=='F') {
			System.out.println("It is Friday");
		} else {
			System.out.println("There is no such day");
		}
				scan.close();
	}

}
