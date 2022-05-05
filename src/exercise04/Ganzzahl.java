package exercise04;

import java.util.Scanner;

public class Ganzzahl {
    public static void main(String[] args) {
        System.out.print("Bitte Nummer eingeben:");
        Scanner scanner = new Scanner(System.in);
        int zahl = scanner.nextInt();

        if (zahl % 2 == 0) {
            System.out.println(" Die Zahl ist gerade");
        } else {
            System.out.println("Falsch");
        }
        scanner.close();
    }

}

