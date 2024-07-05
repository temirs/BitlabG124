package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scan.nextInt();
            }
            catch (InputMismatchException e) {
                scan.next();
                arr[i] = 0;
            }
            arr[i] *= arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
