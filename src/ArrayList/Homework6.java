package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        for (int i = n-1; i >= 0; i--) {
            if (i >= l && i <= r) {
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
