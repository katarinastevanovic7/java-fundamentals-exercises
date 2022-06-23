package exercise11;

public class Caipirinha extends Cocktail {

    public Caipirinha() {
        super("Caipirinha");
        addIngridient(new AlcoholicIngredient("Cachaca", 20, 700),70);
        addIngridient(new Ingredient("Zucker", 3,1000),30);
        addIngridient(new Ingredient("Limette", 4.99,500),50);
    }

}