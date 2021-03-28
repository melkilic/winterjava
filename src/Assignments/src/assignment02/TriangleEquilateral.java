package assignment02;

import java.util.Scanner;

public class TriangleEquilateral {
	public static void main(String[] args) {
		 /* 
	      Let's get 3 positive integers from the user    
	      check if these three numbers are triangular.
	      If it can be a triangle, let's check if it is an equilateral triangle.

	      * The conditions of being triangle.
	      a+b>c>a-b 
	      a+c>b>a-c 
	      b+c>a>b-c 

	      * The conditions of being equilateral triangle.
	      a=b=c  

	      Let's print the following situations on the console.
	      equilateral triangle
	      only triangle
	      not triangle
	               */
	      
	      Scanner in = new Scanner(System.in);
		  System.out.print("Input side1: ");
		  int s1 = in .nextInt();
		  System.out.print("Input side2: ");
		  int s2 = in .nextInt();
		  System.out.print("Input side3: ");
		  int s3 = in .nextInt();

		  if(isValidTriangle(s1, s2, s3)){
			  if((s1 == s2) && (s2 == s3)) {
				  System.out.print(" equilateral triangle");
			  } else {
			  System.out.print("A triangle");
			  }
		  }else {
			  System.out.println("not a triangle");
		  }
		 
		 }
		 public static boolean isValidTriangle(int a, int b, int c) {
		  return (a + b > c && b + c > a && c + a > b);
		 }
	   
	
}
