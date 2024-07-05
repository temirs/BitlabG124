package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            arr1.add(scan.nextInt());
        }
        Collections.sort(arr1);
        int m = scan.nextInt();

        for (int i = 0; i < m; i++) {
            arr2.add(scan.nextInt());
        }

        Collections.sort(arr2);

        System.out.println("Sorted first array:");
        for (Integer num: arr1) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Sorted second array:");

        for (Integer num: arr2) {
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("Sorted third array:");
        arr1.addAll(arr2);
        Collections.sort(arr1);

        for (Integer num: arr1) {
            System.out.print(num + " ");
        }
    }
}
