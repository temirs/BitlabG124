package MapHash;

import java.util.HashMap;
import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();

        while (map.size() < 5) {
            map.put(scan.next(), scan.nextInt());
        }

        for (String key: map.keySet()){
            System.out.println(key + " scored " + map.get(key) + " goals in EPL");
        }
    }
}
