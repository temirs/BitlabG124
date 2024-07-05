package methodsArguments;

public class Classwork16 {
    public static void main(String[] args) {

    }

    public static void printMinAndMax(int[] array){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
