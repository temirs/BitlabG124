package MapHash;

import java.util.HashMap;
import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] word = scan.nextLine().split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length; i++) {
            if (map.containsKey(word[i])){
                map.put(word[i], map.get(word[i]) + 1);
            }else {
                map.put(word[i], 1);
            }
        }

        for (String key: map.keySet()) {
            System.out.println("'" + key + "' occurs " + map.get(key) + " times");
        }
    }
}
