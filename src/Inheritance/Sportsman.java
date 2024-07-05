package Inheritance;

public class Sportsman {
    private String fullName;
    private int age;
    private String country;

    public Sportsman() {
    }

    public Sportsman(String fullName, int age, String country) {
        this.fullName = fullName;
        this.age = age;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String play() {
        return "Sportsman " + fullName + " from " + country + " " + age + " years old is playing.";
    }
}
