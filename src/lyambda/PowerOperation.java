package lyambda;

public class PowerOperation {
    int getPower(int a, int b) {
        Operator power = (s1, s2) -> (int) Math.pow(s1, s2);
        return power.toOperate(a, b);
    }
}
