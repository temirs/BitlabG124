package Interfaces;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Zhansaya Kulbaeva", 20);
        Employee employee2 = new Employee(2,"Kamilla Madiyarova", 21);
        Employee employee3 = new Employee(3,"Shyryn Toktar", 19);
        Employee employee4 = new Employee(4,"Beka Thomas", 20);
        Employee employee5 = new Employee(5,"Didar Zhumabaev", 24);
        Employee employee6 = new Employee(6,"William Thomas", 29);
        Employee employee7 = new Employee(7,"Oliver Jack", 11);

        Application application = new Application();
        application.addEmployee(employee1);
        application.addEmployee(employee2);
        application.addEmployee(employee3);
        application.addEmployee(employee4);
        application.addEmployee(employee5);
        application.addEmployee(employee6);
        application.addEmployee(employee7);

        System.out.println(application.oldestEmployee());
        System.out.println(application.smallestEmployee());
    }
}
