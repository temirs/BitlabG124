package lyambda;

public class SumOperation {
    static int getSum(int a, int b) {
        Operator sum = (s1, s2) -> s1 + s2;

        return sum.toOperate(a, b);
    }
}
