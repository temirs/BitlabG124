package Generics;

import java.util.*;

public class StudentList<T extends Student> {
    private List<T> students = new ArrayList<>();

    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    public void addStudent(T student) {
        students.add(student);
    }

    public void removeStudent(T student) {
        students.remove(student);
    }

    public T getHighestGpaStudent() {
        double max = Integer.MIN_VALUE;
        int max_index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (max < students.get(i).getGpa()) {
                max = students.get(i).getGpa();
                max_index = i;
            }
        }
        return students.get(max_index);
    }

    public void sortByLastName() {
        for (int i = 0; i < students.size()-1; i++) {
            for (int j = 0; j < students.size() - i - 1; j++) {
                if (students.get(j).getLastName().compareToIgnoreCase(students.get(j+1).getLastName()) > 0) {
                    T arr = students.get(j);
                    students.set(j, students.get(j+1));
                    students.set(j+1, arr);
                }
            }
        }
    }

    public List<T> getStudents() {
        return students;
    }

    public void swap(int index1, int index2) {
        T replace = students.get(index1);
        students.set(index1,students.get(index2));
        students.set(index2,replace);
    }
}
