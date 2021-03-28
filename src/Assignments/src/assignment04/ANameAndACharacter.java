package assignment04;

import java.util.Scanner;

public class ANameAndACharacter {
	/*
	Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops.
	e.g:
	char ch1= 'a' ;
	String name =“John came late"
=> number of a = 2
	*/

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = scan.next().charAt(0);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a String");
		String str =  scan1.nextLine();
		
		System.out.println("This character has been repeated " + countChar(str, c) + " times.");
		
	}
	
	public static int countChar(String str, char c)
	{
	    int count = 0;

	    for(int i=0; i < str.length(); i++)
	    {    if(str.charAt(i) == c)
	            count++;
	    }

	    return count;
	}

}
