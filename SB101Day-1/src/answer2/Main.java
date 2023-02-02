package answer2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the product you want..");
		int n = sc.nextInt();
		
		 Queue<Product> productPQ = new PriorityQueue<>();
		
		for(int i=0; i<n; i++) {
		
		System.out.println("Enter product id");
		int id = sc.nextInt();
		
		System.out.println("Enter product name");
		String name = sc.next();
		
		System.out.println("Enter product price");
		int price = sc.nextInt();
		
		productPQ.offer(new Product(id, name, price));
		
		
		
		
		
		
		}
		
     
		
	Iterator<Product> itr =	productPQ.iterator();
	
	while (itr.hasNext()) {
		Product product = itr.next();
		System.out.println(product);
		
	
		
	}
		
		

		
		
		
	}

}
