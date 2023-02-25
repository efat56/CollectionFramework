package que3;

public class Main {

	public static void main(String[] args) {
		
		// Explain AutoBoxing and Auto UnBoxing with Examples.
		
		
		int x = 10;
		
		// auto boxing
		//1
		Integer i1 = Integer.valueOf(x);
		
		//2
		Integer i2 = x;
		
		//3
		Integer i3 = 10;
		
		// auto unboxing
		
		int y = i3;
		
		int z = i3.intValue();
	}

}
