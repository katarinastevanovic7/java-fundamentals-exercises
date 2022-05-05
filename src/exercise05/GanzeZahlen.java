package exercise05;

import java.util.Scanner;

public class GanzeZahlen {

    public static void main(String[] args) {
        System.out.print("input numbers > 0, exit with (99999) (5 times 9)%n");
        Scanner scanner = new Scanner(System.in);


        double i = 0;
        double sum = 0;

        while (true) {
            System.out.println("Input next number:");
            int input = scanner.nextInt();
            if (input < 0) {
                System.out.printf("Error!%ninput numbers > 0");
                return;
            } else if (input == 99999) {
                break;
            } else {
                sum += input;
                i++;
            }
        }
        double durchschnitt = sum / i;
        System.out.println("Durchschnitt: " + durchschnitt);

    }
}
