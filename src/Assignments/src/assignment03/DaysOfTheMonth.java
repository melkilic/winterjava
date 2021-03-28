package assignment03;

import java.util.Scanner;

public class DaysOfTheMonth {
	/* 
	Write the Switch Case java code, which says how many days the user has entered for the month he entered.		 
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(" Please Enter Month Number from 1 to 12 (1 = Jan, and 12 = Dec): ");
		int month = scan.nextInt();
		
		switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("There are 31 Days in this month ");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("There are 30 Days in this Month ");
				break;
			case 2:
				System.out.println("There are Either 28 or 29 Days in this Month ");
				break;
			default:		  	
				System.out.println("\n Please enter Valid Number between 1 to 12");
				
		}
		
	}
}
