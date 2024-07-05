package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int n = 1;

        while (n != 0) {
            n = scan.nextInt();
            if (arr.contains(n) && !arr2.contains(n)) {
                arr2.add(n);
            }
            arr.add(n);
        }
        for (Integer num: arr2) {
            System.out.print(num + " ");
        }
    }
}
