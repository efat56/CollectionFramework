package Q2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	 @FunctionalInterface
	    interface PrintList{
	        abstract void display(List<String> city);
	    }
	    public static void main(String[] args) {

	        List<String> city1= new ArrayList<>();
	        city1.add("Varanasi");
	        city1.add("Lucknow");
	        city1.add("Bhopal");

	        PrintList p=(List<String> city)->{
	            System.out.println("first city is "+city1.get(0));
	        };
	        p.display(new ArrayList<>());
	    }

	

}
