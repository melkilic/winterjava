package day22stringbuildersencapsulation;

public class StringBuilders02 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		
		long startingTimeSb = System.nanoTime();
		for(int i=0; i< 1000; i++) {
			sb1.append("xyz");
		}
		
		long endingTimeSb = System.nanoTime();
		System.out.println(endingTimeSb-startingTimeSb);
		
		
		StringBuffer sbf = new StringBuffer();
		for(int i=0; i< 1000; i++) {
			sbf.append("xyz");
		}
		
		long endingTimeSbf = System.nanoTime();
		System.out.println(endingTimeSbf-endingTimeSb);
	}
}
