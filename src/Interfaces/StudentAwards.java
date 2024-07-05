package Interfaces;

import lyambda.BestStudent;
import lyambda.Student;

import java.util.ArrayList;

public class StudentAwards {
    Student theMostGPA(ArrayList<Student> students) {
        BestStudent bestGpa = (stud) -> {
            double maxGpa = 0;
            int maxIndex = 0;
            for (int i = 0; i < stud.size(); i++) {
                if (maxGpa < stud.get(i).getGpa()) {
                    maxGpa = stud.get(i).getGpa();
                    maxIndex = i;
                }
            }
            return stud.get(maxIndex);
        };
        return bestGpa.theBest(students);
    }

    Student theMostAge(ArrayList<Student> students) {
        BestStudent theOldest = (stud) -> {
            int oldest = 0;
            int maxIndex = 0;
            for (int i = 0; i < stud.size(); i++) {
                if (oldest < stud.get(i).getAge()) {
                    oldest = stud.get(i).getAge();
                    maxIndex = i;
                }
            }
            return stud.get(maxIndex);
        };
        return theOldest.theBest(students);
    }

    Student theLongestFullName(ArrayList<Student> students) {
        BestStudent theLongest = (stud) -> {
            int longFullName = 0;
            int longIndex = 0;
            for (int i = 0; i < stud.size(); i++) {
                if (longFullName < stud.get(i).getFullName().length()) {
                    longFullName = stud.get(i).getFullName().length();
                    longIndex = i;
                }
            }
            return stud.get(longIndex);
        };
        return theLongest.theBest(students);
    }

    Student theHighest(ArrayList<Student> students) {
        BestStudent highOne = (stud) -> {
            int highest = 0;
            int highIndex = 0;
            for (int i = 0; i < stud.size(); i++) {
                if (highest < stud.get(i).getHeight()) {
                    highest = stud.get(i).getHeight();
                    highIndex = i;
                }
            }
            return stud.get(highIndex);
        };
        return highOne.theBest(students);
    }
}
