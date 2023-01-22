package array.test;

import java.util.ArrayList;  // imporetd 2 list seperately
import java.util.*;

public class D7Q41 {
	
	public static void main(String[] args) {
		// can't find the length so using size method for all
		
		System.out.println("======ArrayList=====");
		List l = new ArrayList();
	// 10,20,30,90,10,10,40,50
		
		l.add(10); l.add(20);   l.add(30);   l.add(90);   l.add(10);  l.add(10);  l.add(40);  l.add(50);
	
		// to find length 
		System.out.println(l.size());
		
		System.out.println("======LinkedList=======");
	
		List l1 = new LinkedList();
		// 100,200,300,400,500,600,700
		
		l1.add(100);  l1.add(200);  l1.add(300);  l1.add(400);  l1.add(500);  l1.add(600);  l1.add(700);
		
		System.out.println(l1.size());
		
		// for practice
//		for (int i = 0; i < l1.size(); i++) {
//			
//			System.out.println(l1.get(i));
//		}
		
		System.out.println("=======vector=======");
		
		List l3 = new Vector();
		// 105,205,305,405,505,605,705,805
		
		l3.add(105); l3.add(205); l3.add(305); l3.add(405); l3.add(505); l3.add(605); l3.add(705); l3.add(805);
		
		int size = l3.size();
		System.out.println(size);
		
	}

}
