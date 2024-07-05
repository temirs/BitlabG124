package MapHash;
import java.util.HashMap;


public class University {
    private HashMap<String, Integer> studentList = new HashMap<>();

    public University() {
    }

    public University(HashMap<String, Integer> studentList) {
        this.studentList = studentList;
    }

    public HashMap<String, Integer> getStudentList() {
        return studentList;
    }

    void addStudent(Student student){ // добавляет студента в Hashmap studentList
        studentList.put(student.getName(), student.getGrade());
    }
}
