package day34maps;

import java.util.HashMap;

public class Maps02 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("dog", 3);
		hm1.put("chicken", 7);
		hm1.put("horse", 5);
		hm1.put("elephant", 8);
		
		System.out.println(hm1);
		
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("dog", 3);
		hm2.put("chicken", 7);
		hm2.put("horse", 5);
		hm2.put("elephant", 8);
		
		System.out.println(hm2);
		
		System.out.println(hm1.equals(hm2));//true
	}
}
