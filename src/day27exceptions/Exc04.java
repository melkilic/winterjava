package day27exceptions;

import java.util.Scanner;

public class Exc04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age to see it on the console.");
		int age = scan.nextInt();
		
		System.out.println(getAge(age));
		
		scan.close();
	}
	
	
	public static int getAge(int age) {
		try{if(age<0) {
			throw new IllegalArgumentException();
			}
		}catch(IllegalArgumentException e) {
			System.out.println("Negative values cannot be used in age values");
		}
		
		return age;
	}
}
