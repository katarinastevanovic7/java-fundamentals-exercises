package exercise11;

public class YellowRunner extends Cocktail {

    public  YellowRunner() {
        super("YellowRunner");

        addIngridient(new Ingredient("Ananassaft", 3.99,1000) ,100);

        addIngridient(new Ingredient("Grapefruitsaft",3.99,1000),100);

        addIngridient(new Ingredient("Mandelsyrup", 6.29,250),10);

        addIngridient(new Ingredient("Zitronensaft", 4,200),10);
    }
}