package day21accessmodifierstringbuilders;

public class AccessModifier03 extends AccessModifiers01{
	public static void main(String[] args) {
		AccessModifier03 obj= new AccessModifier03();
		System.out.println(obj.protectedString);
		obj.protectedMethod();
	}
}
