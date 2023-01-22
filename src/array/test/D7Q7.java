package array.test;

import java.util.*;

public class D7Q7 {
	
	public static void main(String[] args) {
		
		List l = new LinkedList();
		
		// 10,20,30,40,50,60
		
		l.add(10); l.add(20); l.add(30); l.add(40); l.add(50); l.add(60);
		
		 l.remove(2);  // index 2 alone removed
		 System.out.println(l);
		 
		 
		 List l1 = new LinkedList();		 
		 // 10,20,30,90,10,10,40
		 l1.add(10); l1.add(20); l1.add(30); l1.add(90); l1.add(10); l1.add(10); l1.add(40);
		 
		// no 10th index is present
		 
		System.out.println(l1.lastIndexOf(10));	// last index of 10
		 l1.remove(5);
		 System.out.println(l1);  // to remove 10
		
	}

}
