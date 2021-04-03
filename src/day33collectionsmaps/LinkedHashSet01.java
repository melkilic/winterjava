package day33collectionsmaps;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	public static void main(String[] args) {
		/*
		 * 1) it adds elements in "insertion order"
		 * 2) it is fast in adding and deleting
		 * (not faster than hashSet)
		 * */
		LinkedHashSet<String> lhs1 = new LinkedHashSet<>();
		lhs1.add("A");
		lhs1.add("K");
		lhs1.add("c");
		lhs1.add("n");
		System.out.println(lhs1);
		lhs1.add("n");//when you add an existing element, it will overWRITE it.
		System.out.println(lhs1);
		
		System.out.println(lhs1.hashCode());//349
		
	
		LinkedHashSet<String> lhs2 = new LinkedHashSet<>();
		lhs2.add("A");
		lhs2.add("j");
		lhs2.add("c");
		lhs2.add("b");
		System.out.println(lhs1.retainAll(lhs2));//true
		System.out.println(lhs1);//[A, c]
		System.out.println(lhs2);//[A, j, c, b]
	}
}
