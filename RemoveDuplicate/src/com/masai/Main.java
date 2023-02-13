package com.masai;

import java.util.LinkedHashSet;

public class Main {
	
	public static void reverseString(String str) {
		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=c.length-1; i>=0; i--) {
			sb.append(c[i]);
			
		}
		System.out.println(sb);
	}
	
	public static String removeDuplicateFromString(String original) {
		
		char[] chr= original.toCharArray();
		
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		
		for(char ch:chr) {
			
			lhs.add(ch);
		}
		
		StringBuilder result= new StringBuilder("");
		
		
		for(char ch: lhs) {
			result.append(ch);
		}
		
		
		
		return result.toString();
		
		
	}




public static void main(String[] args) {
			

	
	//String s= Main.removeDuplicateFromString("Apple");
	
	//System.out.println(s);
	
	
	Main.reverseString("efat");


}

}
