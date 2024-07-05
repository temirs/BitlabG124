package Abstraction;

public class Coke extends Food {
    private double volumeLiters;
    private boolean isSparkling; // Газированная или нет

    public Coke() {
    }

    public Coke(String name, double volumeLiters, boolean isSparkling) {
        super(name);
        this.volumeLiters = volumeLiters;
        this.isSparkling = isSparkling;
    }

    public double getVolumeLiters() {
        return volumeLiters;
    }

    public void setVolumeLiters(double volumeLiters) {
        this.volumeLiters = volumeLiters;
    }

    public boolean isSparkling() {
        return isSparkling;
    }

    public void setSparkling(boolean sparkling) {
        isSparkling = sparkling;
    }

    @Override
    public double getCalories() {
        if (isSparkling) {
            return volumeLiters * 400;
        }
        return volumeLiters * 100;
    }
}
