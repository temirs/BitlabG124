package methodsArguments;

import java.util.Scanner;

public class Classwork6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String login = scan.next();
        String password = scan.next();
        System.out.println(check(login,password));
    }

    public static String check(String login, String password){
        String trueLogin = "admin";
        String truePass = "qwerty";
        if (login.equalsIgnoreCase(trueLogin) && password.equalsIgnoreCase(truePass)){
            return "Authentication completed";
        }
        else {
            return "Invalid login or password";
        }
    }
}
