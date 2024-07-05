package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int [] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scan.nextInt();
            }
            catch (InputMismatchException e) {
                scan.next();
                arr[i] = 0;
            }
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
