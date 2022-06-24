package exercise11;

    public class SwimmingPool extends Cocktail {
        SwimmingPool() {
            super("Swimmeing Pool");

            // 40ml Wodka, der 16,29 pro 1000ml kostet
            addIngridient(new AlcoholicIngredient("Wodka", 16.29, 1000),40);

            // 20ml Blue Curacao, der 8,50 pro 700ml kostet
            addIngridient(new Ingredient("Blue Curacao", 8.50, 700), 20);

            // 120ml Ananassaft, die 1,99 pro 1000ml kostet
            addIngridient(new Ingredient("Ananassaft", 1.16, 1000), 120);

            // 20ml Schlagobers, der 0,65 pro 1000ml kostet
            addIngridient(new Ingredient("Schlagobers", 0.65,200),20);
        }
    }
