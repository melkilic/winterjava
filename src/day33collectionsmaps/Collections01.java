package day33collectionsmaps;

import java.util.HashSet;
import java.util.TreeSet;

public class Collections01 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		long start1 = System.currentTimeMillis();
		for(int i = 0 ; i <1000 ; i++) {
			ts.add(3*i);
			
		}
		System.out.println(ts.size());
		long end1 = System.currentTimeMillis();
		System.out.println(end1-start1);
		
		HashSet<Integer> hs = new HashSet<>();
		long start2 = System.currentTimeMillis();
		for(int i = 0 ; i <1000 ; i++) {
			hs.add(3*i);
			
		}
		System.out.println(hs.size());
		long end2 = System.currentTimeMillis();
		System.out.println(end2-start2);
		
		
		TreeSet ths = new TreeSet<>(hs);
		long start3 = System.currentTimeMillis();
		for(int i = 0 ; i <1000 ; i++) {
			ths.add(3*i);
			
		}
		System.out.println(ts.size());
		long end3 = System.currentTimeMillis();
		System.out.println(end3-start3);
	}
}
