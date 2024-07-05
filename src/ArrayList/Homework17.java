package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        HashSet<Integer> set = new HashSet<>();

        while (num != 0) {
            set.add(num);
            num = in.nextInt();
        }

        System.out.println(set);
    }
}
