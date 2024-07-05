package Inheritance;

public class Swimmer extends Sportsman {
    private String style;
    private double recordTime;

    public Swimmer() {
    }

    public Swimmer(String fullName, int age, String country, String style, double recordTime) {
        super(fullName, age, country);
        this.style = style;
        this.recordTime = recordTime;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(double recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String play() {
        return "Swimmer " + super.getFullName() + " from " + super.getCountry() + ", " + super.getAge() + " years old with " + style + " style swam in " + recordTime + " seconds.";
    }
}
