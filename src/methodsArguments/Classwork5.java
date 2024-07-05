package methodsArguments;

import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        contains(str1,str2);
    }
    public static void contains(String s1, String s2){
        if (s1.contains(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
