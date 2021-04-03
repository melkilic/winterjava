package assignment04;

import java.util.Scanner;

public class FibonacciNumbers {


/*
Get numbers from the user and output that number consecutive Fibonacci number sequence
     	e.g : User enters 10
output : 0 1 1  2  3  5 8 13 21 34
      	*/
	
	public static void main(String[] args) {
		 int count, num1 = 0, num2 = 1;
	        System.out.println("How may numbers you want in the sequence?");
	        Scanner scanner = new Scanner(System.in);
	        count = scanner.nextInt();
	        scanner.close();
	        
	        int i=1;
	        while(i<=count)
	        {
	            System.out.print(num1+" ");
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	            i++;
	        }
	        
	}
}