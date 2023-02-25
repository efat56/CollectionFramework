package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(null);
		list.add(8);
		list.add(null);
		list.add(1);
		
		
		System.out.println(list);
		System.out.println(list.size());
		
		// using for loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//using enhance for loop
		for(Integer i : list ) {
			System.out.println(i);
		}
		
		//Using Iterator
	    Iterator<Integer> itr = list.iterator();
	
	while (itr.hasNext()) {
		Integer integer = itr.next();
		System.out.println(integer);
		
	}
		
	}

}
