package day27exceptions;

import java.util.Scanner;

public class Exc02 {
	public static void main(String[] args) {
		/*
		Get a String from user
	 	Convert it to an integer
	 	Return the integer after multiplying by 2
	 	Your code should not be blocked for any String
	 	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a String");
		String input = scan.nextLine();
		System.out.print(convertStringToInt(input));
		
		scan.close();
	}
		

	public static int convertStringToInt(String input) {
		int a=0;
		try {
			a = Integer.parseInt(input);
			
		}catch(NumberFormatException e) {
			System.out.println(input + " cannot be converted to integer");
		}
		return 2*a;
		
	}
}
