package Interfaces;

public class HRManager implements Worker{
    int id;
    String fullName;
    int salary;

    public HRManager() {
    }

    public HRManager(int id, String fullName, int salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "ID: " + id + ". FULL NAME: " + fullName + ". SALARY: " + salary + ".";
    }

    @Override
    public int getSalary() {
        return salary;
    }
}
