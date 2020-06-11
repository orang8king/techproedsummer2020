package day08ternaryoperatordt;

import java.util.Scanner;

public class Ternary03 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = scan.nextInt();
		System.out.println("Please enter another number");
		int y = scan.nextInt();
		if(x>=y) {
			System.out.println(y);
		}else {
			System.out.println(x);
		}
		System.out.println((x>=y)?y:x);
		scan.close();
	}
}
