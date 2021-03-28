package assignment03;

import java.util.Scanner;

public class FirstHalfOfString {
	/*
	StringMethods:
		Write a Java program to extract the first half of a string of even length.
Example:
		     INPUT      :  Python
		    OUTPUT :   Pyt
    */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a String");
		String input = scan.nextLine();
		System.out.println(input.substring(0, input.length()/2));
	}
}
