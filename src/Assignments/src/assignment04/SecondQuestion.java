package assignment04;

import java.util.Scanner;

public class SecondQuestion {
	/*
	Print even numbers between 1-20 inclusive.  e.g.2 4 6 .. 20


	Print odd numbers between 1-20 inclusive. e.g 1,3,5,7,...,19  Including comma!


	Print all number that is divisible by 5 backward from 20-1 inclusive e.g.20,15,10,5
	 
	Find the sum of all even numbers from 1 - 20 inclusive

	Print all numbers from 1-20 except 11 or 15; use break or continue.
	*/

	public static void main(String[] args) {

		//a
		int i = 0;
		while(i<=20) {
			i++;
			if(i % 2 == 0) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println(" ");
		
		//b
		int e = 0;
		while(e<20) {
			e++;
			if(e % 2 != 0) {
				System.out.print(e + ", ");
			}
		}
		System.out.println(" ");

    
		//c
        int counter = 20;
        do {
           
            if(counter % 5 == 0) {
            	 System.out.print(counter + ", ");
            }
            counter--;
       
        }
        while (counter > 0);
    
        System.out.println(" ");
     
        
        
        //d
        int in,num;
        int evenSum=0;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number for num: \n");
        num=scan.nextInt();
        for(i=1; i<=num; i++){  
        if(i%2==0) 
            evenSum=evenSum+i;
   
        }
     
        System.out.println("Sum of all even numbers are: "+evenSum);
        
        //e
        int m = 0;
		while(m<=20) {
			m++;
			if(m == 11 || m == 15) {
				continue;
			}
			System.out.print(" " + m);
		}
	}
}
