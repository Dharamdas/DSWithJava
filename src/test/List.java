package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class List {
	
	
	public static void main(String[] args) {
		ArrayList<Object> l = new ArrayList<Object>();
		l.add(10);
		l.add(20);
		l.add(300);
		l.add(20);
		System.out.println(l.get(2));
		/*Set<Integer> s = new HashSet<Integer>(l);
		
		l = new ArrayList<Integer>(s);
		
		System.out.println(l.get(2));*/
	}

}
