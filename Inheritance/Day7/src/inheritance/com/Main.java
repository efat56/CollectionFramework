package inheritance.com;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();

        String name = emp.name = "Efat Husneara";
        System.out.println(" Name is : "+name);

        int age = emp.age = 22;
        System.out.println("Age is :"+age);

        String phoneNumber = emp.phoneNumber="6307405551";
        System.out.println("Phone Number is :"+phoneNumber);

        String address = emp.address = "Varanasi";
        System.out.println("Address is : "+address);

        double salary = emp.salary = 65000.00;
        System.out.println("Salary is :"+salary);


    }
}
