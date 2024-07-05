package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        int num = in.nextInt();

        while (num != 0) {
            set.add(num);
            num = in.nextInt();
        }

        num = in.nextInt();
        if (set.contains(num)) {
            System.out.println("Number " + num + " included in the set.");
        } else {
            System.out.println("Number " + num + " not included in the set.");
        }
    }
}
