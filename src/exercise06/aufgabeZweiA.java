package exercise06;

import java.util.Scanner;

public class aufgabeZweiA {

    public static void main(String[] args) {


        double[][] tabelle = new double[10][2];

                for (int i = 0; i < tabelle.length; i++) {
                    for (int j = 0; j < tabelle[i].length; j++) {
                        tabelle[i][j] = i * j;

                    }
                }
                for (int i = 0; i < tabelle.length; i++) {
                    for (int j = 0; j < tabelle[i].length; j++) {
                // System.out.print(tabelle)
                    }
                }
                for (int i = 0; i < tabelle.length; i++) {
                    for (int j = 0; j < tabelle[i].length; j++) {


                        if (j == 0) {
                            if (i % 2 != 0) {
                                tabelle[i][j] = i / 2 + 0.5; //+1
                                System.out.print(tabelle[i][j] + "\t" + "|");
                            } else {
                                tabelle[i][j] = i / 2;
                                System.out.print(tabelle[i][j] + "\t" + "|");
                            }

                        } else {
                            if (i % 2 != 0) {
                                tabelle[i][j] = ((i / 2 + 0.5) * (i / 2 + 0.5));
                                System.out.println(tabelle[i][j]);
                            } else {
                                tabelle[i][j] = ((i / 2) * (i / 2));
                                System.out.println(tabelle[i][j]);
                                // if (i%2 == 0) {
                                // i += 0.5; }

                            }

                        }
                    }
                }
            }
        }


