package assignment05;

import java.util.Scanner;

public class NumberOfChars {

	 /*
		Create a method called numberOfChars and pass 2 parameters; 
		1. car 
		2. String
			char ch = 'p';
			String str = "population is number of people";
			int count = 0;
		then find how many times the given char is repeated in the String and print it on the console
		*Use for loop, increment and if statements
		*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Please enter a String");
		 String str=sc.nextLine();
		 
		 System.out.println("Please enter a character");
		 char ch = sc.next().charAt(0);
		 
		 System.out.println(numberOfChars(ch, str));
	}
	
	public static String numberOfChars(char ch, String str)
	{
		int counter = 0;
		for(int i = 0; i< str.length(); i++) {
			if(ch == str.charAt(i)) {
				counter++;
			}
			
		}
		System.out.println(ch + " is repeated " + counter + " times");
		return str;
	}
	

}
