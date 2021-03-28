package assingment06;

import java.util.Scanner;

public class question01 {
	public static void main(String[] args) {
		
		/* 
		* Write a Java program that reverse a sentence by using Array 
		* (with all spaces and special characters) 
		* Input : Coding is greate. 
		* Output : .etaerg si gnidoC 
		*/ 

		
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a string : ");
		str=scan.nextLine();	
		char[] ch=str.toCharArray(); 
		System.out.println("Reverse of a String is :"); 
		int j=ch.length;
		for(int i=j;i>0;i--)
		{
		System.out.print(ch[i-1]); 
		
		}
		scan.close();
	}

}