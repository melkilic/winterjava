package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class NestedIf01 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a year");
	int year = scan.nextInt();
	
	if(year<0) {
		System.out.println("Enter a valid year");
	}else if(year%100==0){
	if(year%100==0) {
		if(year%400==0) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		}else {
			if(year%4==0) {
				System.out.println(year + " is a leap year");
			}else {
				System.out.println(year + " is not a leap year");
			}
		}
	}	
	}
}
