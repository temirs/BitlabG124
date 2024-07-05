package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        String word = in.next();

        while (!word.equals("exit")) {
            set1.add(word);
            word = in.next();
        }

        word = in.next();

        while (!word.equals("exit")) {
            set2.add(word);
            word = in.next();
        }

        set1.addAll(set2);
        System.out.println(set1);
    }
}
