package student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Student> sList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		while(true) {
			System.out.println("Enter the number of students " + count++);
			
			System.out.println("Enter roll..");
			int roll = sc.nextInt();
			
			System.out.println("Enter name..");
			String name  = sc.next();
			
			System.out.println("Enter marks..");
			int marks = sc.nextInt();
			
			Student s = new Student(roll, name, marks);
			sList.add(s);
			
			System.out.println("if you want to add more student type y/n");
			String t = sc.next();
			
			if(t.equalsIgnoreCase("n")) {
				break;
				
			}
			
		}
		
		System.out.println("Printing Details of all Students");
		System.out.println("=================================");
		
		for(Student student: sList){
		System.out.println("Roll is :"+student.getRoll());
		System.out.println("Name is :"+student.getName());
		System.out.println("Marks is :"+student.getMarks());
		System.out.println("-----------------------------");
		
	}
	}

}
