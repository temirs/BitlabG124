package streamApi;

import java.util.ArrayList;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        arr.stream().filter(s -> s%2==0).forEach(s -> System.out.print(s + " "));
    }
}
