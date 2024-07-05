package Inheritance;

public class Toyota extends Car {
    private String manufacturer;

    public Toyota() {
    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String ride() {
        return "Toyota Car " + super.getName() + " " + super.getModel() + " with max speed " + super.getMaxSpeed() + " km/h from " + super.getYear() + " year with engine volume " + super.getVolume() + " liters manufactured from " + manufacturer + " is riding.";
    }
}
