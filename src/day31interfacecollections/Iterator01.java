package day31interfacecollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iterator01 {
	public static void main(String[] args) {
		
		//By using List.of(), you can create an add methods shortly
		//List<String> list1 = List.of("A", "C", "B");
		List<String> list1 = new ArrayList<>();
		System.out.println(list1);//[A, C, B]
		
		for(String w : list1) {
			w = w + "X";
		}	
		System.out.println(list1);//[A, C, B]
		
		
		Iterator<String> it1 = list1.iterator();
		
		while(it1.hasNext()) {
			
			it1.next();
			
			it1.remove();
			
		}
		
		System.out.println(list1);
	}
}