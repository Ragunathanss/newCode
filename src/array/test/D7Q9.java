package array.test;
import java.util.*;
public class D7Q9 {
	
	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		//100,200,300,400,500,600,700
		
		l.add(100); l.add(200); l.add(300); l.add(400); l.add(500); l.add(600); l.add(700);
		
		//System.out.println(l.indexOf(300)); // to find the index of 3 and replace it by 350
		l.set(2, 350);
		System.out.println(l);
		
		List <Integer>l1 = new ArrayList();
		//10,20,30,90,10,10,40,50,10
		
l1.add(10); l1.add(20); l1.add(30); l1.add(90); l1.add(10); l1.add(10); l1.add(40); l1.add(50); l1.add(10);

l1.set(7, 90);
System.out.println(l1);


List<Integer> l2 = new ArrayList();
//10,20,30,90,10,10,40,50,30

l2.add(10); l2.add(20); l2.add(30); l2.add(90); l2.add(10); l2.add(10); l2.add(40); l2.add(50); l2.add(30);
int size = l2.size();
for (int i = 0; i < size; i++) {
	if (l2.get(i)==10) {
		
		System.out.println(i);  // to find the index that 10 is present
	l2.set(i, 100);  //set 10 as 100 we give i value and convert to it				
	}		
	}
System.out.println(l2);	
}
	}


