package day09nestedternarydt;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter");
		char letter = scan.next().toLowerCase().charAt(0);
		switch(letter) {
			case 'A':
				System.out.println("First letter");
				break;
			case 'B':
				System.out.println("Second letter");
				break;
			case 'C':
				System.out.println("Third letter");
				break;
			case 'D':
				System.out.println("Fourth letter");
				break;
			default: 
				System.out.println("What kind of letter is this?");
			scan.close();
		}

	}

}
