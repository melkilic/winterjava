package week07dt;

public class SimpleCalculator {
/*
 * Create a calculator which has three classes
First class should be named as Simple Calculator
create add, subtract, multiply, divide methods in SimpleCalculator Class
Second class should be named as AdvancedCalculator ,
in this class create absolute method and square root methods
Create a Runner class...
*/
	
	public void add(double... v) {
		double sum = 0;
		for(double w : v) {
			sum += w;
		}
		System.out.println("The sum is " + sum);
	}
	
	public void substract(int a , int b) {
		int substract = a-b;
		System.out.println(substract);
	}
	
	
	public double multiply(double... a) {
		double product = 1;
		
		for ( double w : a) {
			product *= w;
		}
		return product;
	}


	public void divide(double a, double b) {
		
		try {
	        System.out.println("The division is "+a/b);
		}catch(ArithmeticException e){
			System.out.println("You cannot divide by 0");
		}
		
	}


}
