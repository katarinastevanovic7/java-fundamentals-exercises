package exercise04;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("körpergewicht: ");
        double körpergewicht = scanner.nextDouble();
        System.out.print("körpergröße in cm: ");
        double körpergröße = scanner.nextDouble();

        double bmi = körpergewicht / (körpergröße * körpergröße) * 10000.0;
        System.out.printf("Dein BMI-Wert beträgt: %.2f%n", bmi);

        //Bonus
        String ausgabe = bmi < 24.9 && bmi > 18.5 ? "Normalgewichtig" : bmi < 18.05 ? "Untergewichtig" : "Übergewichtig";
        System.out.print(ausgabe);
    }
}
