package array.test;

import java.util.*;

public class D7Q10 {
	
	public static void main(String[] args) {
		
		// 10,20,30,90,10,10,40,50
		List l1 =new ArrayList();
		l1.add(10); l1.add(20); l1.add(30); l1.add(90); l1.add(10); l1.add(10); l1.add(40); l1.add(50);
		
		// 30,40,50,60,80
		List l2 =new ArrayList();
		l2.add(30); l2.add(40); l2.add(50); l2.add(60); l2.add(80);
		
		l1.retainAll(l2);
		System.out.println(l1);  // to print the common values
		
		System.out.println("==================");
		
		// 10,20,30,90,10,10,40,50
		List l3 =new ArrayList();
		l3.add(10); l3.add(20); l3.add(30); l3.add(90); l3.add(10); l3.add(10); l3.add(40); l3.add(50);
		
		
		// 10,20,60,50,40,70,80,90
		List l4 =new ArrayList();
		l4.add(10); l4.add(20); l4.add(60); l4.add(50); l4.add(40); l4.add(70); l4.add(80); l4.add(90); 
		
		l3.retainAll(l4);
		System.out.println(l3);
		
		System.out.println("=================="); 
		
		// 10,20,30,40,50,60,70,80
		List l5 =new ArrayList();
		l5.add(10); l5.add(20); l5.add(30); l5.add(40); l5.add(50); l5.add(60); l5.add(70); l5.add(80);
		
		// 100,200,300,400,500,600,700,8000
		List l6 =new ArrayList();
		l6.add(100); l6.add(200); l6.add(300); l6.add(400); l6.add(500); l6.add(600); l6.add(700); l6.add(8000);
		
		l5.retainAll(l6);
		System.out.println(l5);  // returns empty array since there are no common values b/w these two
		
		
	}

}
