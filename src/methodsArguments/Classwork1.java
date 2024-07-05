package methodsArguments;

import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(getMax(scan.nextInt(), scan.nextInt(), scan.nextInt()));
    }

    public static int getMax(int a, int b, int c){
        int max = Integer.MIN_VALUE;
        if (max < a) {
            max = a;
        }
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }
}
