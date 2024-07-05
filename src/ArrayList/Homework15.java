package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet <String> arr = new HashSet<>();
        String word = in.next();
        int size = 0;

        while (!word.equals("stop")) {
            arr.add(word);
            word = in.next();
        }

        for (String s: arr) {
            size += s.length();
        }
        System.out.println(size);
    }
}
