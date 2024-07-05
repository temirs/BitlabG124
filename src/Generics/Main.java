package Generics;

public class Main {
    public static void main(String[] args) {
        StudentList<Student> studentList = new StudentList<>();

// добавляем студентов разных типов
        studentList.addStudent(new Student("John", "Smith", 1234, 3.8));
        studentList.addStudent(new Student("Emily", "Jones", 2345, 4.0));
        studentList.addStudent(new Student("Alex", "Brown", 3456, 3.6));

// получаем студента с наибольшим средним баллом
        Student highestGpaStudent = studentList.getHighestGpaStudent();
        System.out.println("Student with highest GPA: " + highestGpaStudent);

// сортируем студентов по фамилии
        studentList.sortByLastName();
        System.out.println("Students sorted by last name:");
        for (Student student : studentList.getStudents()) {
            System.out.println(student);
        }

// меняем местами двух студентов
        studentList.swap(0, 1);
        System.out.println("Students after swap:");
        for (Student student : studentList.getStudents()) {
            System.out.println(student);
        }
    }
}
