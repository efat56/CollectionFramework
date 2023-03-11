package string;

public class StringClass {
    public static void main(String[] args) {

//        String s = "Welcome";
//        System.out.println(s.replace("m","n"));;

        // create an array
       // int[] marks = {40, 40, 55, 25, 55};
// access each array elements
//        System.out.println("Accessing Elements of Array:");
//        System.out.println("First Element: " + marks[0]);
//        System.out.println("Second Element: " + marks[1]);
//        System.out.println("Third Element: " + marks[2]);

//
//        for(int i=0; i< marks.length; i++){
//            System.out.println(marks[i]);
//        }
        // using for each loop

//        for(int i : marks){
//            System.out.println(i);
//        }

        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};

        int sum=0;
        double average;

        for(int i : numbers){
              sum+=i;

        }
        System.out.println("Sum is "+sum);
        average = (double) sum/ numbers.length;
        System.out.println("Average is "+average);


    }
}
