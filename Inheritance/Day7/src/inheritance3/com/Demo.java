package inheritance3.com;
import java.util.Arrays;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Total Number of Student");
        int totalStudent = sc.nextInt();


        int[] arr = new int[totalStudent];
        int sum = 0;
        for(int i=0; i<totalStudent; i++)
        {
            System.out.println("Roll Number is");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.println("Student Name is");
            String name = sc.nextLine();

            System.out.println("Student address is");
            String address = sc.nextLine();

            System.out.println("Student Marks is");
            int marks = sc.nextInt();

            sum = sum+marks;


            System.out.println("Student rollNumber :" +roll);
            System.out.println("Student Name : " +name);
            System.out.println("Student Address  : " +address);
            System.out.println("Student Marks : " +marks);


            System.out.println("=============================");

        }
        //double ave = Arrays.stream(arr).average();
        //System.out.println("Average marks are "+average);
        System.out.println("Average is : "+(sum/totalStudent));



    }
}
