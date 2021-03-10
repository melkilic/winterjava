package day14constructorsstatickeywordarrays;


/* 1)Static Block is used to initialize static(class) variables
 * 2) If you need some variables to initialize before constructors and main method are executed, you should initialize the variable by static block.
 * 3)If you have multiple static blocks, the static block at the top runs first.
 * 
 * */
public class StaticBlock {
	public static int age;
	
	static {
		System.out.println("Static block is executed");
		age = 23;
	}
	
	static {
		System.out.println("Static block is executed");
		age = 24;
	}
	
	
	public StaticBlock() {
		System.out.println("Constructor is executed");
		System.out.println(++age);
	}
	public static void main(String[] args) {
		System.out.println("Constructor is executed first");
		System.out.println(++age);
		StaticBlock obj = new StaticBlock();
		System.out.println("Constructor is executed second");
	}
	
}
