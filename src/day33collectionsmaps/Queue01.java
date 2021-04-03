package day33collectionsmaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	public static void main(String[] args) {
		Queue <String> q1 = new PriorityQueue<>();
		
		q1.add("Merve");
		q1.add("Shadi");
		q1.add("Ahmet");
		q1.add("Serife");
		q1.add("Melike");
		System.out.println(q1);//[Ahmet, Melike, Merve, Shadi, Serife]
		
		System.out.println(q1.element());//Ahmet
		//element() returns the first element but it doesn't remove it.
		System.out.println(q1);//[Ahmet, Melike, Merve, Shadi, Serife]
		
		
		System.out.println(q1.peek());//Ahmet
		//peek() returns the first element but it doesn't remove it.
		System.out.println(q1);//[Ahmet, Melike, Merve, Shadi, Serife]
	}
}
