package array.test;

import java.util.LinkedList;
import java.util.*;

public class D7Q8 {
	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		// 10,20,30,90,10,10,40,50
		l.add(10); l.add(20); l.add(30); l.add(90); l.add(10); l.add(10); l.add(40); l.add(50);
		
		l.add(2, 50); // to add value in 2nd index
		System.out.println(l);
		
		System.out.println(l.lastIndexOf(50)); // find last index and to add 70 at last index
		l.add(9, 70);
		System.out.println(l);
		
		l.add(8, 80); // to add 80 at 8th index
		System.out.println(l);
		
		System.out.println(l.lastIndexOf(10)); // to find last index of 10 and add 100 in it
		l.add(6, 100);
		System.out.println(l);
		
		
	}

}
