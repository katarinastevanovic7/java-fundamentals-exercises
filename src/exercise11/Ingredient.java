package exercise11;

public class Ingredient {
    private String name;
    private double basePrice;
    private double baseWeight;

    public   Ingredient( String name, double basePrice, double baseWeight){
        this.name=name;
        this.basePrice=basePrice;
        this.baseWeight=baseWeight;
    }
    public double getBasePrice() {

        return basePrice;
    }
    public double getBaseWeight() {

        return baseWeight;
    }

    public String getName(){
        return name;
    }
}