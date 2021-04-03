package assignment04;

import java.util.Scanner;

public class DuplicateChars {
	/*
	Write a code that returns the duplicate chars in a String array e.g. 
	String str=“ilovejavatoo” 
	Output: o v a
	         	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scan.nextLine();
		
		String duplicates = "";

		    for (int i = 0; i < str.length() - 1; i++) {
		        for (int j = i + 1; j < str.length(); j++)

		        {
		            if (str.charAt(i) == str.charAt(j)) {

		                if (!duplicates.contains(String.valueOf(str.charAt(j)))) {
		                    duplicates += str.charAt(j);
		                    break;
		                }

		            }
		        }
		    }

		    System.out.println(duplicates);
	}
}
