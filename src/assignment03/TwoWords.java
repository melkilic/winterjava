package assignment03;

import java.util.Scanner;

public class TwoWords {
	/*
	create 2 words : name1 and name2
	 if the name1 has even numbers of characters,
	 then insert the second word in the middle of the first name
	 if the first word has odd numbers
	 Then print the “Name2 cannot be inserted in the name1”
	 e.g:
	 name1= mehmet
	 name2= ahmet
	 Print ==> mehahmetmet
	*/
	
	public static String insertString( 
	        String name1, 
	        String name2,
	        int j
	       ) 
	    { 
	  
	        // Create a new string 
	        String newString = name1.substring(0,j) + name2 + name1.substring(j,(name1.length()));
	  
	        // return the modified String 
	        return newString; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	  
	        // Get the Strings 
	    	System.out.println("Enter First String");
	        Scanner scan = new Scanner (System.in);
	        String name1 = scan.next();
	        System.out.println("Enter Second String");
	        Scanner scan2 = new Scanner (System.in);
	        String name2 = scan2.next();
	        int i = name1.length();
	        int j = i/2;
	  
	  
	        // Insert the String 
	        System.out.println("Modified String: "
	                           + insertString(name1, 
	                        		   name2, 
	                                          j)); 
	        
	    } 
}

