package day08stringmethodcreation;

public class StringMethods01 {
	public static void main(String[] args) {
		String str1 = "yasemin ozkafa";
		System.out.println(str1.substring(4));//min ozkafa
		//first index is inclusive, second one is exclusive
		System.out.println(	str1.substring(3,6));//emi
		System.out.println(	str1.substring(5,5));//nothing
		
		/* trim()
		 * removes the first and the last space character
		 */
		String str2= "  This is Java";
		System.out.println(str2.trim().length());//12
		
		String str3 = " Ayse123 kaya%   ";
		System.out.println(str3.replaceAll("\\W", "").replace("kaya", "KAYA").replace("123"," "));
		
		
		//BUG!
		//2nd way
		String firstname = str3.substring(2,6);
		String lastname = str3.substring(10,14).toUpperCase();
		System.out.println(firstname + " " + lastname);
		
		/*String str3 = "   Ayse123 kaya/%    ";
		String a = str3.replaceAll("\\W", "");
		System.out.println(a);
		String b = a.replaceAll("\\d", "");
		System.out.println(b);
		String c = b.substring(0, 4);
		String d = b.substring(4).toUpperCase();
		String e = c + " " + d;
*/
		
		
		//concat() is used to join Strings
		
		System.out.println(firstname.concat(lastname));
 	}
}
