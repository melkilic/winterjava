package day21accessmodifierstringbuilders;

public class StringBuilder01 {
	public static void main(String[] args) {
		//to create a StringBuilder:
		//1st way:
		StringBuilder sb1 = new StringBuilder();
		sb1.append("String Builders ");
		sb1.append("Are").append("mutable");
		System.out.println(sb1);
		
		//2nd way:
		StringBuilder sb2 = new StringBuilder(9);
		sb2.append("Java");
		System.out.println(sb2);
	}
}
