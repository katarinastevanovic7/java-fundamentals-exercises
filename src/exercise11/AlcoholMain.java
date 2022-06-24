package exercise11;

public class AlcoholMain {

    public static void main(String[] args) {
        AlcoholicIngredient cachaca = new AlcoholicIngredient("Cachaca", 10.8, 700);
        Ingredient limette = new Ingredient("Limette", 0.49, 50);

        System.out.println();
        System.out.println(cachaca.getName());
        System.out.println(cachaca.getBasePrice() + "€");
        System.out.println(cachaca.getBaseWeight() + " ml");

        System.out.println();
        System.out.println(limette.getName());
        System.out.println(limette.getBasePrice() + "€");
        System.out.println(limette.getBaseWeight() + " g");

        System.out.println();
        Cocktail yellowRunner = new YellowRunner();
        System.out.println(yellowRunner.getName());
        System.out.printf("%.2f%n", yellowRunner.getPrice());
        System.out.println(yellowRunner.getWeigth() + " ml");
        System.out.println(yellowRunner.constainsAlkohol());

        System.out.println();
        Cocktail swimmingPool = new SwimmingPool();
        System.out.println(swimmingPool.getName());
        System.out.printf("%.2f%n", swimmingPool.getPrice());
        System.out.println(swimmingPool.getWeigth() + " ml");
        System.out.println(swimmingPool.constainsAlkohol());

        System.out.println();
        Cocktail caipirinha = new Caipirinha();
        System.out.println(caipirinha.getName());
        System.out.printf("%.2f%n", caipirinha.getPrice(), "%s", "€");
        System.out.println(caipirinha.getWeigth() + " ml");
        System.out.println(caipirinha.constainsAlkohol());

        //Cocktail cocktail = new Cocktail("Cocktail");
    }
}

