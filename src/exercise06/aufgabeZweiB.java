package exercise06;

import java.util.Scanner;

public class aufgabeZweiB {

    public static void main(String[] args) {
        int[][] x = new int[10][2];
        System.out.println("Enter a number and i will return the square: ");
        System.out.print(" \nEnter a number between 0 and 4.5 and i will return the square");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        if (input >= 0 && input <= 4.5) {
            System.out.println(input * input);
        } else {
            System.out.println("Falsche Eingabe!");
        }
        scanner.close();
    }
}

