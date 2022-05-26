package exercise08;

import java.io.IOException;

    public class AddressMain {
        public static void main(String[] args) throws IOException {

            //Aufgabe 1b
            System.out.println(Address.postCodeToCity(88630));
            System.out.println(Address.postCodeToCity(99998));
            System.out.println(Address.postCodeToCity(99996));


            //Aufgabe 1c
            Address address1 = new Address();
            address1.setPostCode(88630);
            System.out.println(address1.toString());

            Address address2 = new Address();
            address2.setPostCode(99998);
            System.out.println(address2.toString());

            Address address3 = new Address();
            address3.setPostCode(99996);
            System.out.println(address3.toString());
        }
    }
