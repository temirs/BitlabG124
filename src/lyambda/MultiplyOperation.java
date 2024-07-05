package lyambda;

public class MultiplyOperation {
    int getMultiplication(int a, int b) {
        Operator multiply = (s1, s2) -> s1 * s2;
        return multiply.toOperate(a, b);
    }
}
