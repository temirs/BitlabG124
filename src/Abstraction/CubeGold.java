package Abstraction;

public class CubeGold extends GoldShape{
    private double side;

    public CubeGold() {
    }

    public CubeGold(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}
