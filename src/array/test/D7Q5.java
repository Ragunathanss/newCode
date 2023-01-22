package array.test;

import java.util.*;

public class D7Q5 {
	
	public static void main(String[] args) {
		
		List <Integer> l = new LinkedList();		
		// 10,20,30,90
		// first index of 10
		l.add(10);  l.add(20);  l.add(30);  l.add(90);
		int indexOf = l.indexOf(10);
		System.out.println(indexOf);
		
		
		List <Integer> l1 = new LinkedList();
		// 10,20,30,90,10,10,40,50
		// last index of 10
		l1.add(10); l1.add(20); l1.add(30); l1.add(90); l1.add(10); l1.add(10); l1.add(40); l1.add(50);
		int lastIndexOf = l1.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		List <Integer> l2 = new LinkedList();
		//10,20,30,90,10,10,40,50
		// index value of 50
		l2.add(10); l2.add(20); l2.add(30); l2.add(90); l2.add(10); l2.add(10); l2.add(40); l2.add(50);	
		System.out.println(l2.indexOf(50));
		
		// index value of 90
		System.out.println(l2.indexOf(90));
		
		System.out.println("====to get each value====");
		
		List <Integer> l3 = new LinkedList();
		//10,20,30,90,10,10,40,50,10
		l3.add(10); l3.add(20); l3.add(30); l3.add(90); l3.add(10); l3.add(10); l3.add(40); l3.add(50); l3.add(10);	
		
		
	System.out.println("=====print index of 10======");
	int size = l3.size();  // to provide size
		for (int i = 0; i < size; i++) {  // since we dont have length in it, we use size here for iterration
			//System.out.println("*********"+l3.get(i));
			if (l3.get(i)==10) {
				System.out.println((i));
//				System.out.println("______");
//				System.out.println(l3.get(i));
			}
			
		}
		
		System.out.println("=======index of 90======");
		int size2 = l3.size();
		for (int i = 0; i < size2; i++) {
			if (l3.get(i)==90) {
				System.out.println(i);
			}
		}
		
	}

}
