package day07stringmanipulations;

public class StringManipulations01 {
	/* toUpperCase() toLowerCase() contains() charAt() next() nextLine() equals() equalIgnoreCase()
	 * indexOf() lastIndexOf() length() 
	 * */
	
	public static void main(String[] args) {
		String str1 = "learn coding by practicing";
		//startsWith() can be used only with Strings. So, double quotes.
		System.out.println(str1.startsWith("l")); //true
		System.out.println(str1.startsWith("c",6));//skip the first 6 characters and see the first one that comes after those 6 starts with "c".
		System.out.println(str1.startsWith("by",13));
		
		//endsWith() is used to check if the String ends with the specific suffix. Only with Strings, not with chars. Can be used with multiple characters. Returns boolean.
		System.out.println(str1.endsWith("g"));//true
		System.out.println(str1.endsWith("co"));//false
		System.out.println(str1.isEmpty());//false
		
		//isEmpty() returns boolean.
		String s = "";
		System.out.println(s.isEmpty());//true
		
		//replace() replaces all occurrences of a specific character
		//Command + Option + R to replace multiple occurrences of the same character all at once
		String str2 = "Java is easy";
		System.out.println(str2.replace("a", "e"));//Jeve is eesy
		System.out.println(str2);//Java is easy(it doesn't change the original String)
		System.out.println(str2.replace("a", ""));//Jv is esy
		System.out.println(str2.replace("", "!"));//!J!a!v!a! !i!s! !e!a!s!y!
		
		String str3 = "Teach more, learn123 more!!! ...";
		/* Regular Expressions ==>  
	      *1) \\s: space character
	       2) \\S: all characters except space character
	       3) \\w: a->z  A->Z _    0->9
	       4) \\W: All characters except a->z    A->Z _    0->9
	       5) \\d: 0 -> 9
	       6) \\D: All characters except 0 -> 9
	*/
	    //\\s: space character :
	    System.out.println(str3.replaceAll("\\s", "*"));// Teach_more,*learn123*more!!!**..
	    //\\S: all characters except space character
	    System.out.println(str3.replaceAll("\\S", "*"));// *********** ******** *******  **
	    //\\w: a->z  A->Z _    0->9
	    System.out.println(str3.replaceAll("\\w", "&"));// &&&&&&&&&&, &&&&&&&& &&&&!!!  ..
	    //\\W: All characters except a->z    A->Z _    0->9
	    System.out.println(str3.replaceAll("\\W", "%"));// Teach_more%%learn123%more%%%%%%%
	    //\\d: 0 -> 9
	    System.out.println(str3.replaceAll("\\d", "+"));// Teach_more, learn+++ more!!!  ..
	    //\\D: All characters except 0 -> 9
	    System.out.println(str3.replaceAll("\\D", "*"));// *****************123************
	    
	    //17) replaceFirst()
	    // replaceFirst() changes just the first occurrance of the character
	    System.out.println(str3.replaceFirst("a", "e")); //Teech_more, learn123 more!!!  ..

		
	}
}
