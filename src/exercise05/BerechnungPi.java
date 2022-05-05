package exercise05;

public class BerechnungPi {

    public static void main(String[] args) {

                int k = 10;
                double pi = 0;
                double nenner = 1;
                for (int i = 0; i < k; i++) {
                    if (i % 2 == 0) {
                        pi = pi + (1 / nenner);
                    } else {
                        pi = pi - (1 / nenner);
                    }
                    nenner = nenner + 2;
                }
                pi = pi * 4;
                System.out.println(pi);
            }
        }


