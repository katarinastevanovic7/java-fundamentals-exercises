package exercise09;

import exercise08.Car1;
import exercise08.Color;
import exercise08.Manufacturer;

public class RaceMain {


    public static void main(String[] args) {
        Car[] contestantes = new Car[5];
        contestantes[0] = new Car(Car.Color.BLACK, Car.Manufacturer.AUDI,180 , "Katarina");
        contestantes[1] = new Car(Car.Color.SILVER, Car.Manufacturer.BMW, 250, "Alina");
        contestantes[2] = new Car(Car.Color.GREEN, Car.Manufacturer.BMW,300 , "Max");
        contestantes[3] = new Car(Car.Color.RED, Car.Manufacturer.PORSCHE,360 , "Bob");
        contestantes[4] = new Car(Car.Color.BLUE, Car.Manufacturer.TOYOTA,160 , "Alice");






        CarRace race = new CarRace(500, contestantes);
        race.race();
        race.printTimes();
        System.out.println("Gewinner: "+ race.getWinner());
        System.out.println("Verlierer: "+race.getLoser());
    }
}