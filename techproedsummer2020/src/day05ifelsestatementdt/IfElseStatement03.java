package day05ifelsestatementdt;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		// User enters the quantity of the products 
		//and the unit price of the product
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the quantity of the product");
		int quantity = scan.nextInt();
		System.out.println("Enter the unit price");
		int unitPrice = scan.nextInt();
		if (quantity>1000) {
			System.out.println("You got 10% discount and the total price is: "+ (quantity*unitPrice*0.9));
		} else {
			System.out.println("No discount. The total price is: " + (quantity*unitPrice));	
			}
		scan.close();
	}
}
