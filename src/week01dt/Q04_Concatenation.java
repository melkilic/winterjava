package week01dt;

import java.util.Scanner;

public class Q04_Concatenation {
	public static void main(String[] args) {
		/*
        Write a Java program to create a string in the form Str1 + Str2 + Str1 from two strings. 
    EXAMPLE:
    INPUT      : Str1 =Refrigerator
                 Str2 = Empty
    
    OUTPUT :    EmptyRefrigeratorEmpty
        */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first String");
		
		String str1 = scan.next();
		System.out.println("Enter the first String");
		String str2 = scan.next();
		System.out.println(str1 + str2 + str1);
//		System.out.println(2+1+2+4+ "TechProEd");
	}
}
