package assignment05;

import java.util.Scanner;

public class ReverseTheInput {
	/*
	Write the method that will print the reverse of the number you received from the user on the console.

	*/

	   public static void reverseMethod(int number) {
	       if (number < 10) {
		   System.out.println(number);
		   return;
	       }
	       else {
	           System.out.print(number % 10);
	           //Method is calling itself: recursion
	           reverseMethod(number/10);
	       }
	   }
	   public static void main(String args[])
	   {
		int num=0;
		System.out.println("Enter your number");
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		System.out.print("");
		reverseMethod(num);
		System.out.println();

	}
}
