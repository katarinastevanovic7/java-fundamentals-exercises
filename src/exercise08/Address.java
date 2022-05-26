package exercise08;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

    public class Address {

        public String name;
        public String street;
        public String city;
        public int postcode;

        public Address() {
        }


    public Address(String name, String street) {
        this(name, street, "", -1);
        System.out.println("Konstruktor String, String");
        }

        public Address(int postcode, String city) {
        System.out.println("Konstruktor int, String");
        this.postcode = postcode;
        this.city = city;
    }

    public Address(String name, String street, String city,
                   int postcode) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
    }

      //Aufgabe 1a
    static String postCodeToCity ( int postcode) throws IOException {

        Path File = Paths.get("/Users/katarinastevanovic/Downloads/OpenGeoDB-plz-ort-de-semi.csv");
        Scanner fileScanner = new Scanner(File, "UTF-8");

        String cityToPlz = null;

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);
            lineScanner.useDelimiter(";");
            int plz = lineScanner.nextInt();
            String city = lineScanner.next();
            if (plz == postcode) {
                cityToPlz = city;
            }
            lineScanner.close();
        }
        fileScanner.close();
        return cityToPlz;
    }

        //Aufgabe 1c
        void setPostCode(int postcode) throws IOException {
            this.postcode = postcode;
            String s = postCodeToCity(postcode);
            this.city = s;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "name='" + name + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", postcode='" + postcode +
                    '}';
        }

        }




