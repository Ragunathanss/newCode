package array.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class D7Q123 {
	
	public static void main(String[] args) {	
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double add =0;
		double average;
	for (int i = 0; i < a.length; i++) {
		add = add+a[i];		
		
	}	
	
	// sum
	System.out.println("to add all value");
		System.out.println(add);
		
		// average
		average = add/a.length;
		System.out.println("to take average");
		System.out.println(average);
			
		// to remove duplicate
	Set s = new LinkedHashSet();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(60);
		s.add(80);
		s.add(60);
		s.add(50);
		for (Object object : s) {
			System.out.println(object);
		}
		
		
			
		}
	}
	
	
	


