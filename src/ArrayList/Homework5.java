package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int sum = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
            if (i >= l && i <= r) {
                sum += arr.get(i);
            }
        }
        System.out.println(sum);
    }
}
