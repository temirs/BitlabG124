package methodsArguments;

public class Classwork19 {
    public static void main(String[] args) {

    }

    public static void check(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 50 && array[i] % 5 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
