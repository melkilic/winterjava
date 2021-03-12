package day22stringbuildersencapsulation;

public class StringBuilder01 {
	public static void main(String[] args) {
		String s = "Java";
		String s1 = s.concat("x");
		System.out.println(s1);
		
		StringBuffer sbf = new StringBuffer("Java");
		sbf.append("x");
		System.out.println(sbf);
		
		StringBuilder sb = new StringBuilder("Java");
		sb.append("x");
		System.out.println(sb);
	}
}
