package assignment02;

import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String[] args) {
		  /* 
	      Write the switch case java code that prints the day of the week when the user enters a number between 1 and 7.		
	       */
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Please enter the day of the week");
	      int days = scanner.nextInt();
	      switch(days) {
	      case 1:
	       System.out.println("Monday");
	        break;
	      case 2:
	    	  System.out.println("Tuesday");
	        break;
	      case 3:
	    	  System.out.println("Wednesday");
	    	  break;
	      case 4:
	    	  System.out.println("Thursday");
	    	  break;
	      case 5:
	    	  System.out.println("Friday");
	    	  break;
	      case 6:
	    	  System.out.println("Saturday");
	    	  break;
	      case 7:
	    	  System.out.println("Sunday");
	    	  break;
	}
	}
}
