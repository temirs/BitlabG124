package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<Integer> arr = new HashSet<>();
        int n = 0;
        int sum = 0;

        while (n < 5) {
            arr.add(scan.nextInt());
            n++;
        }

        for (Integer s: arr) {
            sum += s;
        }

        System.out.println(sum);
    }
}
