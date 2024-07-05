package methodsArguments;

import java.util.Scanner;

public class Classwork7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(getAverage(arr));
    }
    public static double getAverage(int array[]){
        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0) {
                sum += array[i];
                count ++;
            }
        }
        return (double) sum/count;
    }
}
