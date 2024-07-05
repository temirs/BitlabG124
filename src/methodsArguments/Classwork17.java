package methodsArguments;

import java.util.Scanner;

public class Classwork17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        char c = scan.next().charAt(0);
        System.out.println(operate(a, b, c));
    }

    public static double operate(int a, int b, char c){
        switch (c) {
            case '+':
                return (double) a + b;
            case '-':
                return (double) a - b;
            case '*':
                return (double) a * b;
            case '/':
                return (double) a / b;
            default:
                return 0;
        }
    }
}
