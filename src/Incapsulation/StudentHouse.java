package Incapsulation;

public class StudentHouse {
    private String name;
    private Student[] students = new Student[1000];
    private int size = 0;

    public StudentHouse() {
    }

    public StudentHouse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printStudents() {
        for (int i = 0; i < size; i++) {
            if (students[i]!= null){
                System.out.println(students[i]);
            }
        }
    }

    public void addStudent(Student student) {
        students[size] = student;
        size ++;
    }

    public void deleteStudent(int i){
        students[i] = null;
    }

    public Student theBestStudent() {
        double max = 0;
        int id = 0;

        for (int i = 0; i < size; i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa();
                id = i;
            }
        }
        return students[id];
    }
}
