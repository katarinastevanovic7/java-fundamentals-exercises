package exercise11;

abstract class Cocktail {
    private String name;
    private double price;
    private double weigth;
    private boolean hasAlcohol;

    Cocktail(String name) {
        this.name = name;

    }

    void addIngridient(Ingredient ingredient, double weigth) {

        price += (ingredient.getBasePrice() / ingredient.getBaseWeight()) * weigth;
        this.weigth += weigth;

        if (ingredient instanceof AlcoholicIngredient) {
            this.hasAlcohol = true;
        }

    }

    public boolean constainsAlkohol() {

        return hasAlcohol;
    }


    public double getPrice() {

        return price;
    }

    public double getWeigth() {

        return weigth;
    }

    public String getName() {

        return name;
    }

}
