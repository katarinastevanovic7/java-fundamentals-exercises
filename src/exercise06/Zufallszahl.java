package exercise06;

import java.util.Arrays;

public class Zufallszahl {

    public static void main(String[] args)

    {
        {
            double sum = 0;
            double durchschnitt = 0;
            int kleinsteZahl = Integer.MAX_VALUE;
            int groeßteZahl = Integer.MIN_VALUE;
            // int randomNumber = 0;
            int[] numbers = new int[101];
            for (int i = 0; i < numbers.length; i++) {
                int randomNumber = (int) (101 * Math.random());
                numbers[i] = randomNumber;
                //System.out.println(numbers[i]);
                sum += randomNumber;
                durchschnitt = sum / 101;
                if (randomNumber < kleinsteZahl) kleinsteZahl = randomNumber;
                if (randomNumber > groeßteZahl) groeßteZahl = randomNumber;


            }
            for (int x = 0; x < numbers.length; x++) {
                System.out.println("i: " + x + " | " + numbers[x]);
            }


            System.out.println("__________\nDie summe beträgt: " + sum);
            System.out.printf("Durchschnitt beträgt: %.2f \n" , durchschnitt);
            System.out.println("Kleinste Zahl: " + kleinsteZahl);
            System.out.println("Größte Zahl: " + groeßteZahl);
            System.out.println("__________\nArray:");
            System.out.println(Arrays.toString(numbers));

        }
    }
}

