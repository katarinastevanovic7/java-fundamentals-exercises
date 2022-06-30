package exercise12;

import java.util.Locale;

    public class Zeichenkette {

        static boolean palindrom(String wort) {
            wort = wort.toLowerCase();
            if (wort.length() <=1) {
//wort.length()>=0 && wort.contains()=
                return true;
            }

            if (wort.charAt(0) == wort.charAt(wort.length() - 1)) {
                return palindrom(wort.substring(1, wort.length() - 1));

            }
            return false;
        }
    }
