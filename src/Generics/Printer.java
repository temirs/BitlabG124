package Generics;

public class Printer <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void printValue() {
        System.out.println("Value is " + t);
    }
    public void refresh() {
        this.t = null;
    }
}
