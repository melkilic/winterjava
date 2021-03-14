package day23encapsulationinheritance;

public class Encapsulation01 {
	private String name = "Ali Can";
	private int age = 21;
	private boolean retired = false;
	private char initial = 'A';
	private String address = "Miami Florida";

	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	//for getters of boolean variables start the name of the getter method with "is"
	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
	//to make "initial" variable readable, creating a getter method is enough.
	public char getInitial() {
		return initial;
	}
	//Make "address" just updatable, you should not create "getter", you should create "setter"
	public void setAdress(String address) {
		this.address = address;
	}
	
	/*
	 * If you don't want to update a value, don't create a setter for it. 
 		Question:How can you make a class “immutable class”?
	 	Answer: Make all variables private then do not create any setter method
	 * */
	
}
