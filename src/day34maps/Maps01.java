package day34maps;

import java.util.HashMap;

public class Maps01 {

	public static void main(String[] args) {
		HashMap <Integer, String> hm1= new HashMap<>();
		hm1.put(101, "Milk");
		hm1.put(102, "Cheese");
		hm1.put(103, "Meat");
		hm1.put(107, "Butter");
		hm1.put(110, "Honey");
		
		//using the same key will overwrite the value
		hm1.put(101,"Apple");
		System.out.println(hm1);
		//you can add the same value again
		hm1.put(111,"Honey");
		System.out.println(hm1);
		
		//you can use null as a key
		hm1.put(null, "Orange");
		System.out.println(hm1);
	}

}
