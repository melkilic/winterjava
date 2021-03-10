package day04ifelse;

import java.util.Scanner;

public class IfElseStatement02 {
	public static void main(String[] args) {
		
		/* 
		  Ask user to enter a character, check whether the character is alphabetic
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = scan.next().toLowerCase().charAt(0);
		
		if(ch >= 'a' && ch <= 'z') {
				System.out.println("It is from alphabet");
		}
	}
}
