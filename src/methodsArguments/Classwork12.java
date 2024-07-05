package methodsArguments;

import java.util.Scanner;

public class Classwork12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        redouble(word);
    }

    public static void redouble(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "" + str.charAt(i));
        }
    }
}
