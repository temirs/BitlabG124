package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<String> arr = new HashSet<>();
        String word = in.next().toLowerCase();
        int size = 0;
        String vowels = "aeuio";
        int count = 0;

        while (!word.equals("stop")) {
            if (!arr.contains(word)) {
                for (int i = 0; i < word.length(); i++) {
                    if (vowels.contains(String.valueOf(word.charAt(i)))) {
                        count++;
                    }
                }
            }
            arr.add(word);
            word = in.next().toLowerCase();
        }

        System.out.println(count);
    }
}
