package array.test;

import java.util.ArrayList;
import java.util.List;

public class D7Q11 {
	
	public static void main(String[] args) {
		
		// 10,20,30,90,10,10,40,50
		List l =new ArrayList();
		l.add(10); l.add(20); l.add(30); l.add(90); l.add(10); l.add(10); l.add(40); l.add(50);
		
		// 30,40,50,60,80
		List l1 =new ArrayList();
	    l1.add(30);	l1.add(40); l1.add(50); l1.add(60); l1.add(80);
	
	l.removeAll(l1);
	System.out.println(l);
	
	System.out.println("==================");
	
	// 10,20,30,90,10,10,40,50
	List l2 =new ArrayList();
	l2.add(10); l2.add(20); l2.add(30); l2.add(90); l2.add(10); l2.add(10); l2.add(40); l2.add(50);
	
	// 10,20,60,50,40,70,80,90
	List l3 =new ArrayList();
	l3.add(10); l3.add(20); l3.add(60); l3.add(50); l3.add(40); l3.add(70); l3.add(80); l3.add(90);
	
	l2.removeAll(l3);
	System.out.println(l2);
	
	System.out.println("==================");
	
	// 10,20,30,40,50,60,70,80
	List l4 =new ArrayList();
	l4.add(10); l4.add(20); l4.add(30); l4.add(40); l4.add(50); l4.add(60); l4.add(70); l4.add(80);
	
	// 100,200,300,400,500,600,700,8000
	List l5 =new ArrayList();
	l5.add(100); l5.add(200); l5.add(300); l5.add(400); l5.add(500); l5.add(600); l5.add(700); l5.add(8000);
	
	l4.removeAll(l5);  // prints all value since there is no common values in it
	

	System.out.println(l4);
	
	
	}

}
