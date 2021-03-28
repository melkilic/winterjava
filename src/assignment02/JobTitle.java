package assignment02;

import java.util.Scanner;

public class JobTitle {
	public static void main(String[] args) {
		  /*
        Print “Please enter your job title” 
        Create a String variable named “jobTitle” and get the data from the user. 
        Use the below test data to print the correct jobTitle. Example :
        if job Title is qa then print “Your job title is Quality Analyst” 
        test data: qa then print Quality Analyst 
        dev then print Developer 
        ba then print Business Analyst 
        pm then print Project Manager
       */

	      Scanner scan = new Scanner(System.in);
	      System.out.println("Please enter your job title ");
	      String jobTitle = scan.nextLine();
	      switch(jobTitle) {
	      case "QA":
	       System.out.println("Your job title is Quality Analyst");
	        break;
	      case "DEV":
	    	  System.out.println("Your job title is Developer");
	        break;
	      case "BA":
	    	  System.out.println("Your job title is Business Analyst");
	    	  break;
	      case "PM":
	    	  System.out.println("Your job title is Project Manager");
	    	  break;

	
	    }
	      
	}
}
