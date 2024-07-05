package Inheritance;

public class Gymnast extends Sportsman {
    private int height;
    private int weight;
    private String style;

    public Gymnast() {
    }

    public Gymnast(String fullName, int age, String country, int height, int weight, String style) {
        super(fullName, age, country);
        this.height = height;
        this.weight = weight;
        this.style = style;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String play() {
        return "Gymnast " + super.getFullName() + " from " + super.getCountry() + " " + super.getAge() + " years old, " + weight + " kg, " + height + " cm, with " + style + " style is jumping.";
    }
}
