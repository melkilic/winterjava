package assignment03;

import java.util.Scanner;

public class MiddleCharacter {
	/*
	Ask user to enter a word. If the word has odd number of characters length() of characters and has 3 or more characters, print the character in the middle of the word.
	*/
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input a string: ");
	        String str = in.nextLine();
	        System.out.print("The middle character in the string: " + middle(str)+"\n");
	    }
	 public static String middle(String str)
	    {
	        int position;
	        int length;
	        if (str.length() % 2 == 0 && str.length()>3)
	        {
	            position = str.length() / 2 - 1;
	            length = 2;
	        }
	        else
	        {
	            position = str.length() / 2;
	            length = 1;
	        }
	        return str.substring(position, position + length);
	    
	}
}
