package tryCatch;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        double div;

        if (b != 0) {
            System.out.println(a / b);
        } else {
            try {
                div = a / b;
            }
            catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }
        }
    }
}
