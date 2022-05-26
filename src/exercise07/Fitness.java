package exercise07;

public class Fitness {

        public static double bmi(double gewicht, double groesse) {
            return gewicht / (groesse * groesse);
        }


        public static void main(String[] args) {
            System.out.printf("Katarina: %.2f%n",bmi(50, 1.65));
            System.out.printf("Alina: %.2f%n",bmi(60,167));
            System.out.printf("Max: %.2f%n",bmi(70,1.70));
        }
    }

