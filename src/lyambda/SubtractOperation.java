package lyambda;

public class SubtractOperation {
    static int getSubtraction(int a, int b) {
        Operator minus = (s1, s2) -> s1 -s2;

        return minus.toOperate(a, b);
    }
}
