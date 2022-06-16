package exercise07;

import java.util.Scanner;

public class Eis {

    public static void main(String[] args) {

        //  eisSorten[] wahl = {eisSorten.ERDBEER, eisSorten.HASELNUSS, eisSorten.KIRSCHE, eisSorten.PISTAZIE, eisSorten.SCHOKOLADE, eisSorten.HASELNUSS};
        Eissorte eis[];


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Kugeln wollen sie ?: ");
        int anzahl = scanner.nextInt();

        //Läge des Arrays bestimmen
        eis = new Eissorte[anzahl];
        System.out.println(eis.length);


        System.out.println("Wählen sie einer der unteren Eissorten aus\n-------------------------------------------- ");
        Eissorte[] allValues = Eissorte.values();
        for (Eissorte scoop : allValues) {
            System.out.print(scoop + " ");
        }
        System.out.println();
        double summe = 0;


        for (int i = 0; i < eis.length; i++) {
            Scanner sortenScanner = new Scanner(System.in);
            String sorte = sortenScanner.next();
            Eissorte sortenWahl = Eissorte.valueOf(sorte);
            eis[i] = sortenWahl;
            // double summe = 0;
//                switch (sortenWahl) {
//                    case VANILLE:
//                        summe += 1.00;
//                        break;
//                    case KIRSCHE:
//                        summe += 1.50;
//                        break;
//                    default:
//                        summe += 1.20;
//                }

            if (sortenWahl == Eissorte.KIRSCHE) {
                double preis = 1.50;
                System.out.println(eis[i] + "EIS kostet " + preis);
                summe += preis;

            } else if (sortenWahl.equals(Eissorte.VANILLE)) {
                double preis = 1.00;
                System.out.println(eis[i] + "EIS kostet " + preis);
                summe += preis;

            } else {
                double preis = 1.20;
                System.out.println(eis[i] + "EIS kostet " + preis);
                summe += preis;


            }
        }

        System.out.println("Dein Eis besteht aus : ");
        for (Eissorte wahl : eis) {
            System.out.print(wahl + " ");


        }

        System.out.println("Dein Eis kostet " + summe + "€");
    }
}

