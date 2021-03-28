package assingment06;

import java.util.Scanner;

public class question02 {
	public static void main(String[] args) {
		
		/* 
		* Create an int array with 5 elements. 
		int [] arr = {1, 2, 3, 4, 5}; 
		* Print the elements of the Array on console. 
		* Increment all elements of array and print array on console.(use for loop) 
		int [] arr = {2, 3, 4, 5, 6}; 
		* Increment all elements of array again and print array on console.(use foreach loop) 
		int [] arr = {3, 4, 5, 6, 7}; 
		*/

		 int n, i = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:"); //5
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            a[i]++;
	        }
	        System.out.print("Elements of array after increment by 1:");
	        for(i = 0; i < n - 1; i++)
	        {
	            System.out.print(a[i]+",");
	        }
	        System.out.print(a[n-1]);
	        
	        for(int i1 : a ) {
	        	int num = a[i1]++;
	        	System.out.println(num);
	        }
	}
}
