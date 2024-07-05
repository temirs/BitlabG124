package methodsArguments;

public class Classwork2 {
    public static void main(String[] args) {

    }

    public static String triangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
