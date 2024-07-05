package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt()/2);
        }
        for (Integer num: arr) {
            System.out.print(num + " ");
        }
    }
}
