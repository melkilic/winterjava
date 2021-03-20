package week07dt;

public class AdvanceCalculator extends SimpleCalculator {
	public void absValue(double a) {
		System.out.println("the absolute value is " + Math.abs(a));
	}
	
	public void sqrRoot(double a) {
		try {
			System.out.println("the square root is " + Math.sqrt(a));
		}catch(ArithmeticException e) {
			System.out.println("There cannot be a negative number in square root");
		}
	}
}
