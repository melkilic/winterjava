package day08stringmethodcreation;

public class ConvertStringToNumber {
	public static void main(String[] args) {
		//how to convert String to number
		String s1 = "$12.99";
		String s2 = "$5.00";
		
		String str1 = s1.replace("$", "").replace(".", "");
		String str2 = s2.replace("$", "").replace(".", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		//parseInt() method converts Strings to integer if all they have in them is numbers
		System.out.println((Integer.parseInt(str1)+Integer.parseInt(str2))/100);
		//valueOf() method converts Strings to decimals if all they have in them is numbers
		System.out.println((Integer.valueOf(str1)+Integer.valueOf(str2))/100.0);
		
		String s4 = "$13.99";
		String s5 = "$9.00";

		String str4 = s4.replace("$", "");
		String str5 = s5.replace("$", "");
		
		System.out.println(Double.valueOf(str4)+Double.valueOf(str5));
	}
}
