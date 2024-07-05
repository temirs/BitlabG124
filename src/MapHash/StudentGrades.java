package MapHash;
import java.util.Map;
import java.util.HashMap;

public class StudentGrades {
    private Map<String, Integer> grades = new HashMap<>();

    void addStudent(String name, int grade){
        grades.put(name, grade);
    }

    void printStudentsAboveGrade(int threshold){
        for (String key: grades.keySet()){
            if (threshold < grades.get(key)) {
                System.out.println(key + ": " + grades.get(key));
            }
        }
    }
}
