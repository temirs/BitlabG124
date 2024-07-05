package lyambda;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        ArrayList<String> arr = new ArrayList<>();

        while (!word.equals("exit")) {
            arr.add(word);
            word = scan.next();
        }

        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = 0; j < arr.size()-i-1; j++) {
                if (arr.get(j).length() > arr.get(j+1).length()) {
                    String swapper = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, swapper);
                }
            }
        }
        System.out.println(arr);
    }
}
