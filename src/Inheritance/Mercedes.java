package Inheritance;

public class Mercedes extends Car {
    private String classType;

    public Mercedes() {
    }

    public Mercedes(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    @Override
    public String ride() {
        return "Mercedes Car " + super.getName() + " " + super.getModel() + " with max speed " + super.getMaxSpeed() + " km/h from " + super.getYear() + " year with engine volume " + super.getVolume() + " liters with " + classType + " class is riding.";
    }
}
