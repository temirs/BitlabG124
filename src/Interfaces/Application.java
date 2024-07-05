package Interfaces;

public class Application implements EmployeeInterface{
    Employee[] employees = new Employee[1000];
    int count = 0;

    @Override
    public Employee search(String fullName) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getFullName().equalsIgnoreCase(fullName)) {
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee oldestEmployee() {
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getAge() > max) {
                max = employees[i].getAge();
                max_index = i;
            }
        }
        return employees[max_index];
    }

    @Override
    public Employee smallestEmployee() {
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for (int i = 0; i < count; i++) {
            if (employees[i].getAge() < min) {
                min = employees[i].getAge();
                min_index = i;
            }
        }
        return employees[min_index];
    }

    @Override
    public void addEmployee(Employee e) {
        employees[count] = e;
        count++;
    }

    @Override
    public void deleteEmployee(int index) {
        this.employees[index] = null;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < count; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i]);
            }
        }
    }
}
