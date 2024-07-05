package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        HashSet<Integer> arr = new HashSet<>();
        int n = in.nextInt();
        int sum = 0;

        while (n != 0) {
            arr.add(n);
            n = in.nextInt();
        }

        for (Integer s: arr) {
            sum += s;
        }

        System.out.println(sum);
    }
}
