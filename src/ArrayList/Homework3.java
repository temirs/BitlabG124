package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int n = scan.nextInt();

        int max = Integer.MIN_VALUE;
        int max_index = 0;

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
            if (max < arr.get(i)) {
                max = arr.get(i);
                max_index = i;
            }
        }

        arr.remove(max_index);
        max = Integer.MIN_VALUE;

        for (Integer num: arr) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
