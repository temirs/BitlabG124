package MapHash;

import java.util.HashMap;
import java.util.Scanner;

public class Classwork1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            map.put(scan.next(), scan.nextInt());
        }

        for (String key: map.keySet()) {
            System.out.println(key + " costs " + map.get(key) + " USD");
        }
    }
}
