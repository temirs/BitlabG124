package Interfaces;

public class Cow implements Animal{
    private String name;
    private double weight;
    private int age;

    public Cow() {
    }

    public Cow(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOld(){
        return age > 5;
    }

    @Override
    public String getSound() {
        return "Moo!";
    }
}
