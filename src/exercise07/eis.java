package exercise07;

import java.util.Scanner;

    public class eis {

        public static void main(String[] args) {

            //  eisSorten[] wahl = {eisSorten.ERDBEER, eisSorten.HASELNUSS, eisSorten.KIRSCHE, eisSorten.PISTAZIE, eisSorten.SCHOKOLADE, eisSorten.HASELNUSS};
            EISSORTEN eis[];


            Scanner scanner = new Scanner(System.in);
            System.out.println("Wie viele Kugeln wollen sie ?: ");
            int anzahl = scanner.nextInt();

            //Läge des Arrays bestimmen
            eis = new EISSORTEN[anzahl];
            System.out.println(eis.length);


            System.out.println("Wählen sie einer der unteren Eissorten aus\n-------------------------------------------- ");
            EISSORTEN[] allValues = EISSORTEN.values();
            for (EISSORTEN scoop : allValues) {
                System.out.print(scoop + " ");
            }
            System.out.println();
            double summe = 0;



            for (int i = 0; i < eis.length; i++) {
                Scanner sortenScanner = new Scanner(System.in);
                String sorte = sortenScanner.next();
                EISSORTEN sortenWahl = EISSORTEN.valueOf(sorte);
                eis[i] = sortenWahl;
                // double summe = 0;


                if (sortenWahl.equals(EISSORTEN.KIRSCHE)) {
                    double preis = 1.50;
                    System.out.println(eis[i] + "EIS kostet " + preis);
                    summe += preis;

                } else if (sortenWahl.equals(EISSORTEN.VANILLE)) {
                    double preis = 1.50;
                     System.out.println(eis[i] + "EIS kostet " + preis);
                    summe += preis;

                } else {
                    double preis = 1.00;
                    System.out.println(eis[i] + "EIS kostet " + preis);
                    summe += preis;


                }
            }

            System.out.println("Dein Eis besteht aus : ");
            for (EISSORTEN wahl : eis) {
                System.out.print(wahl + " ");


            }

            System.out.println("Dein Eis kostet " + summe + "€");


        }
    }

