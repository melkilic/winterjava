package day13constructors;

public class Car {
	public String make;
	public String model;
	public int price;
	public int year;

	public static void main(String[] args) {
	Car myCar1 = new Car();
	
	System.out.println(myCar1.make);
	System.out.println(myCar1.model);
	System.out.println(myCar1.price);
	System.out.println(myCar1.year);
	
	myCar1.move();
	myCar1.stop();
}
	
	public static void move() {
		System.out.println("Moves fast");
	}
	
	public static void stop() {
		System.out.println("It stops when you stop the engine.");
	}
	
}