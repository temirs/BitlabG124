package ArrayList;

import java.util.Set;

public class Student {
    private String name;
    private Set<String> courses;

    public Student() {
    }

    public Student(String name, Set<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getCourses() {
        return courses;
    }

    public void setCourses(Set<String> courses) {
        this.courses = courses;
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void removeCourse(String course) {
        courses.remove(course);
    }

    void listCourses() {
        courses.forEach(System.out::println);
    }
}
