package methodsArguments;

public class Classwork4 {
    public static void main(String[] args) {

    }

    public static String palindrome(String str){
        for (int i = 0; i < str.length(); i++) {
            if (!String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(str.length()-1-i)))) {
                return "NO";
            }
        }
        return "YES";
    }
}
