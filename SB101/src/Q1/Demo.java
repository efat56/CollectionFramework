package Q1;

import java.util.ArrayList;
import java.util.List;

public class Demo<T> {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		
		int a = arrayList.get(0);
		System.out.println(a);
		
		
	}
}
