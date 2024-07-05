package methodsArguments;

import java.util.Scanner;

public class Classwork13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(countVowels(word));
    }

    public static int countVowels(String str){
        int count = 0;
        String glass = "aeiou";
        for (int i = 0; i < str.length(); i++) {
            if (glass.contains(String.valueOf(Character.toLowerCase(str.charAt(i))))){
                count ++;
            }
        }
        return count;
    }
}
