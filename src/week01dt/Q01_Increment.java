package week01dt;

public class Q01_Increment {
	public static void main(String[] args) {
		int a = 3;
		double d = 4.5;
		
		//d = 4.5 + a = 3
		d += a;
		//3 + 7.5
		a += d;
		//d - a => 7.5 - 10 = -2.5
		d -= a;
		//10 -(-2.5)= 12.5 => 12
		a -= d;
		
		System.out.println(" d =" + ++d);
	    System.out.println(" a =" + a--);
		
	}
}
