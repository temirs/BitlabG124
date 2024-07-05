package Abstraction;

public class FerrariEngine extends Engine{
    public FerrariEngine() {
    }

    public FerrariEngine(double engineVolume, int cylinderAmount, double engineWeight) {
        super(engineVolume, cylinderAmount, engineWeight);
    }

    public double efficiency() {
        return 0.25;
    }

    public double throttleEnergy() {
        return this.getEngineVolume() * this.getCylinderAmount() * 100;
    }

    public double breakEnergy() {
        return this.getEngineWeight() * 2;
    }
}
