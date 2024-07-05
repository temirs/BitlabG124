package ArrayList;

import java.util.HashSet;
import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet <String> arr = new HashSet<>();
        int n = 0;

        while (n < 10) {
            arr.add(scan.next());
            n++;
        }

        System.out.println(arr.size());
    }
}
