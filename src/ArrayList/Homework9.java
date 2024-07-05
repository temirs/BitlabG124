package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        int n = 1;

        while (n != 0) {
            n = scan.nextInt();
            if (n > 1) {
                arr.add(n);
                arr2.add(n);
            }
            for (int i = 2; i < n; i++) {
                if (n > 3 && n % i == 0) {
                    arr2.remove(arr2.size()-1);
                    break;
                }
            }
        }

        for (Integer num: arr2) {
            System.out.print(num + " ");
        }
    }
}
