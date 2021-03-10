package day13constructors;

public class Animal {
	/*
	 *1) Constructors must have name with the class
	 *2) Constructor names start with upper cases -they have to match with the class names
	 *3) Methods have to return type, but constructors don't.
	 */
	public String name = "Terry";
	public int weight = 78;
	public static boolean isHerbivorous=true;
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		System.out.println(dog.name);
		System.out.println(dog.weight);
		System.out.println(dog.isHerbivorous);
		
		dog.move();
		dog.drink();
		dog.eat();
	}
	
	public static void eat() {
		if(isHerbivorous) {
		System.out.println("Feeding on plants");
		}else {
			System.out.println("Feeding on meat and plants");
		}
	}
	
	public static void drink() {
		System.out.println("Drinks water");
	}
	public static void move() {
		System.out.println("Moves");
	}
}
