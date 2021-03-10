package day13constructors;

import java.util.Scanner;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	/** The constructor below has no parameters.
	It also doesn't have a body. 
	This kind of constructors are the same as the default constructors. 
	Note: If you create a constructor, Java deletes the default one.*/
	public Dog() {
		
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(int weight, int height) {
	
	}
	
	public Dog(String name, int weight, int height) {
		this.name = name;
		this.weight=weight;
		this.height=height;
	}
	
	
	public static void main(String[] args) {
		Dog dog1 = new Dog("Joe");
		Dog dog2 = new Dog("Joe", 12, 2);
		System.out.println(" My dog is called " + dog2.name + " he is " + dog2.height + " feet tall and weighs " + dog2.weight);
		dog2.sound();
		//create object in the class to access class members
		Scanner scan = new Scanner(System.in);
	}
	public void sound() {
		System.out.println("Dogs bark");
	}
}
