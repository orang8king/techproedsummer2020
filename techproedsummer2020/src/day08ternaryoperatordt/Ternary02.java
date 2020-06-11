package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int x = scan.nextInt();
		if(x%2==0) {
			System.out.println("The integer is even");
		}else {
			System.out.println("The integer is odd");
		}
		System.out.println((x%2==0)?"The integer is even":"The integer is odd");
		scan.close();
	}
	

}
