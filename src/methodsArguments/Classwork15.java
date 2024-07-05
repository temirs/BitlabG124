package methodsArguments;

import java.util.Scanner;

public class Classwork15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        printUniqueElements(arr);
    }

    public static void printUniqueElements(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count ++;
                }
            }
            if (count == 1) {
                System.out.print(array[i] + " ");
            }
            count = 0;
        }
    }
}
