package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        boolean weCanSum = false;

        while (!weCanSum) {
            try {
                sum += scan.nextInt();
                count ++;
            }
            catch (InputMismatchException e) {
                System.out.println("Error: Invalid data entered. Try again");
                count = 0;
                scan.next();
                sum = 0;
            }
            if (count > 1) {
                System.out.println("Sum of numbers: " + sum);
                weCanSum = true;
            }
        }
    }
}
