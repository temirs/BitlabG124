package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
            if (arr.get(i) > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
