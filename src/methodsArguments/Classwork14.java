package methodsArguments;

public class Classwork14 {
    public static void main(String[] args) {

    }

    public static int count(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                counter += 1;
            }
        }
        return counter;
    }
}

