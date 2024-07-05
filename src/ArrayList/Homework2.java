package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        int n = scan.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
            sum += arr.get(i);
        }
        System.out.println((double) sum/n);
    }
}
