package day08stringmethodcreation;

public class MethodCreation01 {
	public static void main(String[] args) {
		System.out.println(add(3,4));
		System.out.println(add(3.4, 5.6));
	}
		public static double add(double num1, double num2) {
			return num1+num2;
		}
}
