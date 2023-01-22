package array.test;

import java.util.*;

public class D7Q6 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		//10,20,30,40,50,60
		l.add(10);  l.add(20);  l.add(30);  l.add(40);  l.add(50);  l.add(60);		
		Integer integer = l.get(2);
		System.out.println(integer);
		
		List<Integer> l1 = new ArrayList();	
		// 100,200,300,400,500,600,700
		l1.add(100); l1.add(200); l1.add(300); l1.add(400); l1.add(500); l1.add(600); l1.add(700);
		System.out.println(l1.get(4));
		
		
		List<Integer> l2 = new ArrayList();	
		//105,205,305,405,505,605,705,805
		l2.add(105); l2.add(205); l2.add(305); l2.add(405); l2.add(505); l2.add(605); l2.add(705); l2.add(805);
		System.out.println(l2.get(7));  // shows error for 8th index since there is only 7 index
		
		System.out.println("=====for=======");
		
		for (int i = 0; i < l2.size(); i++) {
			System.out.println(l2.get(i));
		}
		
		System.out.println("======for each====");
		for (Integer output : l2) {
			System.out.println(output);
		}
	}

}
