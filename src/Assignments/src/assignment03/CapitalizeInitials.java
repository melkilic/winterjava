package assignment03;

import java.util.Scanner;

public class CapitalizeInitials {
	/* 
	Ask user to enter firstName and lastName then make first initials uppercase and rest should be all lovercase
	ferhat => Ferhat
	kirac => Kirac
	          */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = "";
		
		
		System.out.println("Enter your last name");
		String lastName = "";
		
		do {
			
			firstName = scan.next();
			lastName = scan.next();
			
			System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1));
			System.out.println(lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
			
							
			
		}while(!(firstName.charAt(0)>='A' && firstName.charAt(0)<='Z'));
		
		scan.close();
	}
}
