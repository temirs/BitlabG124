package Abstraction;

public class RenaultEngine extends Engine{
    private double extraTurboEnergy;

    public RenaultEngine() {
    }

    public RenaultEngine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurboEnergy) {
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double getExtraTurboEnergy() {
        return extraTurboEnergy;
    }

    public void setExtraTurboEnergy(double extraTurboEnergy) {
        this.extraTurboEnergy = extraTurboEnergy;
    }

    public double efficiency() {
        return 0.27;
    }

    public double throttleEnergy() {
        return getEngineVolume() * getCylinderAmount() * 110 + extraTurboEnergy;
    }

    public double breakEnergy() {
        return this.getEngineWeight() * 2.1;
    }
}
