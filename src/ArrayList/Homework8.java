package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int n = 1;
        int max = Integer.MIN_VALUE;

        while (n != 0) {
            n = scan.nextInt();
            arr.add(n);
        }

        for (Integer num: arr) {
            if (num < 0) {
                System.out.print(num + " ");
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println();
        System.out.println(max);
    }
}
