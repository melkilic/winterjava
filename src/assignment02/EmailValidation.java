package assignment02;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		/*
        Ask the user to enter an email
       If it doesn't contain the @ sign, print "enter a valid email"
       If it only says "gmail.com" after the @ sign, print "email approved"
       If it says anything other than "gmail.com" after the @ sign, write "Please enter your gmail account"         
       INPUT : techproed.com OUTPUT : “enter a valid email”
       INPUT : techproed@gmail.com OUTPUT : “email approved”
       INPUT : techproed@hotmail.com OUTPUT : “Please enter your gmail account”
       */
	

		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String input = sc.next();
	      String regex = "@";
	      //Matching the given phone number with regular expression
	      boolean result = input.contains(regex);
	      if(result) {
	         System.out.println("Email approved");
	      } else {
	         System.out.println("Enter a valid email");
	      }
	      String domain = input.substring(input.indexOf("@") + 1);
	      if(domain != "gmail.com") {
	    	  System.out.println("Please enter your gmail account");
	      };
		
	}
}
