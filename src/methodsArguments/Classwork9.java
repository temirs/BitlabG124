package methodsArguments;

import java.util.Scanner;

public class Classwork9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        show(arr);
    }

    public static void show(int array[]){
        int i = 0;
        while (array[i] != 23) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
            i ++;
        }
    }
}
