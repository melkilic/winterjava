package day07stringmanipulations;

import java.util.Scanner;

public class Substring01 {
/*
 * A part of a String is called substring
 * substring() of String class is used to get a substring from the String
 * We use substring() to get a part of a String by using indexes
 * */
	
	public static void main(String[] args) {
		String s1 = "Java is Java";
		System.out.println(s1.substring(5));//is Java
		System.out.println(s1.substring(7));// Java
		System.out.println(s1.substring(0));//Java is Java because 0 is inclusive
		System.out.println(s1.substring(s1.length()-1));//to get the last character in a dynamic way

		/*
		 * System.out.println(s1.substring(13)); //compile run time error
		 We have two type of error messages:
		 1)While we type our codes we get "red underline" this is called "Compile Time Error"
		 2)While we type our codes we don't get any "red underline" but after running our codes we
		 get red messages on the console, it is "Run Time Error"
		 */

		
		String s2 = "Java is OOP language";
		System.out.println(s2.substring(0,3)); //Jav
		System.out.println(s2.substring(0,14)); //Java is OOP la

		/*
        Ask user to enter a String 
        If the first and the last character of the String are same
        print "Wooow!" otherwise, print "Hmmmm!" on the console
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String str3 = scan.nextLine();
		String first = str3.substring(0,1);
		String last = str3.substring(str3.length()-1);
		
		if(first.equals(last)){
			System.out.println("Woow");
			
		}else {
			System.out.println("Hmmm!");
		}
	}
}
