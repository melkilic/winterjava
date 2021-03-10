package day17lists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
	public static void main(String[] args) {
		List<Character> list1= new ArrayList<>();
		list1.add('x');
		list1.add('y');
		list1.add('z');
		list1.add('e');
		list1.add('g');
		list1.add('b');
		list1.add('x');
		
		
		List<Character> list2= new ArrayList<>();
		for(int i=0; i<list1.size();i++) {
			if(list2.contains(list1.get(i))) {
				continue;
			}
			list2.add(list1.get(i));
		}
		System.out.println(list2);
	}
}
