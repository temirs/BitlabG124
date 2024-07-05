package methodsArguments;

public class Classwork20 {
    public static void main(String[] args) {

    }

    public static String getSeason(int m){
        if (m == 1 || m == 2 || m == 12) {
            return "Winter";
        } else if (m == 3 || m == 4 || m == 5) {
            return "Spring";
        } else if (m == 6 || m == 7 || m == 8) {
            return "Summer";
        } else {
            return "Autumn";
        }
    }
}
