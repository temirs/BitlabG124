package methodsArguments;

import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        Character letter = scan.next().charAt(0);

        System.out.println(check(word, letter));
    }

    public static int check(String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(letter))) {
                count ++;
            }
        }
        return count;
    }
}
