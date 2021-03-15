package day24inheritanceoverriding;
​public class Dog extends Mammal {
	
	public boolean smellWell;
	
	public Dog() {
		super();//If you type "super()" it is fine, 
		        //if you do not type Java puts it automatically
		System.out.println("Dog constructor without parameter...");
	}
	
	public Dog(boolean smellWell) {
		super(true);
		//If you do not type any parent constrcutor call inside the first line
		//Java uses the parent constructor without parameter automatically
		this.smellWell = smellWell;
		
	}​
}