package methodsArguments;

public class Classwork18 {
    public static void main(String[] args) {
    }

    public static void printMax(int[][] array){
        for (int i = 0; i < array.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
            System.out.println(max);
        }
    }
}
