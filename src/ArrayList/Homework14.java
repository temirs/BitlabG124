package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> arr = new HashSet<>();
        int n = in.nextInt();
        String control = "NO";

        while (n != 0) {
            arr.add(n);
            if (n == 77) {
                control = "YES";
            }
            n = in.nextInt();
        }

        System.out.println(control);
    }
}
