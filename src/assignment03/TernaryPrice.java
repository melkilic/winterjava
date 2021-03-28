package assignment03;

import java.util.Scanner;

public class TernaryPrice {
	/*Write a code using ternary:
	Create int variable : price
	Create string variable : decision
	If the price = $10 Print “cheap”
	If price is 10-$20 print “ok”
	Otherwise “expensive”.
	*/

	public static void main(String[] args) {
		
		int price;
		String decision;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter The Price ");
		price = scan.nextInt();
		
		System.out.println(decision = price == 10 ? "cheap" : price > 10 && price < 20 ?  "ok" : "expensive");
		
	}

}
