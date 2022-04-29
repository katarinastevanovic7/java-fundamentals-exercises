package exercise03;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte folgenden Satz eingeben 'Lake Constance is 63 kilometers long'");
        String satz = scan.nextLine();
        String firstWord = satz.substring(0, 4);
        System.out.println(firstWord);
        System.out.println(satz);
        System.out.println(satz.contains(" "));
    }


}
