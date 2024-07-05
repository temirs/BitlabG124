package Classes;

public class Phone{
    String name;
    String model;
    int price;

    public Phone(){
    }

    public Phone(String name, String model, int price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getData(){
        return this.name + " - " + this.model + " for " + this.price + " KZT";
    }
}