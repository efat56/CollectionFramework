package que1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<>();
		
		strList.add("one");
		strList.add("two");
		strList.add("three");
		strList.add("four");
		strList.add("five");
		strList.add("six");
		strList.add("seven");
		strList.add("one");
		strList.add(null);
		strList.add("one");
		strList.add(null);
		strList.add("eight");
		
		
		System.out.println(strList);
		System.out.println(strList.size());
		
		
		//Using normal for loop
		for(int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		
		//Enhance for loop
		for(String s : strList) {
			System.out.println(s);
		}
		
		
		//Using Iterator 
		Iterator<String> itr = strList.iterator();
		
		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
			
		}

	}

}
