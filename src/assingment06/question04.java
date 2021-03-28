package assingment06;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class question04 {
	public static void main(String[] args) {
	/*
	 * Write a program that deletes those with the letter 'a' or ‘A’ in it. 
	* INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} 
	* OUTPUT : [Veli,Omer]
	
	*/
		 String[] names = {"Ali","Veli","Ayse","Fatma","Omer"};
		    List<String>list=new ArrayList<>();
		    for(int i=0; i<names.length;i++) {
	      	  list.add(names[i]);
	        }
		  System.out.println(list);
		    
		    ListIterator<String> it5= list.listIterator();	
	    
	        while(it5.hasNext()){
	        	String str=it5.next();
	           if(str.contains("a") || str.contains("A")) {
	        	   it5.remove();
	           }
	           
		    }System.out.println(list);
		}	
		
	}
