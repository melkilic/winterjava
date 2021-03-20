package hackerrank;

import java.util.Scanner;

public class IfElse {
	/*
	 * Given an integer, n , perform the following conditional actions:

	If n is odd, print Weird
	If n is even and in the inclusive range of 2 to 5 , print Not Weird
	If n is even and in the inclusive range of 6 to 20 , print Weird
	If n is even and greater than 20 , print Not Weird
	Complete the stub code provided in your editor to print whether or not  is weird.*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number");
		int n = scan.nextInt();
		
		if(n % 2 == 0) {
			if(n>=2 && n<=5) {
				System.out.println("Not Weird");
			}else if(n>=6 && n<=20) {
				System.out.println("Weird");
			}else if(n>20) {
				System.out.println("Not Weird");
			};
			
			
		}else{
			System.out.println("Weird");
		}
	}
}
