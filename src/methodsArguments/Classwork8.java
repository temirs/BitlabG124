package methodsArguments;

import java.util.Scanner;

public class Classwork8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        replace(arr);
    }

    public static void replace(int array[][]){
        int len = array.length;
        int[][] new_arr = new int[len][len];

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i==0){
                    new_arr[len-1][j] = array[i][j];
                } else if (i==len-1) {
                    new_arr[0][j] = array[i][j];
                } else {
                    new_arr[i][j] = array[i][j];
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(new_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
