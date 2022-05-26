package exercise08;

public class CarMain {
    public static void main(String[] args){
        Car aCar = new Car();
        
        System.out.println("Color: " + aCar.color + " Manufacturer: + " +
               aCar.manufacturer + " maxSpeedKmh: " + aCar.maxSpeedKmh );

        //2d Test
        System.out.println(aCar.toString());


        Car Porsche = new Car(Color.BLACK, Manufacturer.PORSCHE, 400 );
        Car Volkswagen = new Car(Color.SILVER, Manufacturer.VOLKSWAGEN, 120 );
        Car Ferrari = new Car(Color.RED, Manufacturer.FERRARI, 500 );
        Car Toyota = new Car(Color.BLUE, Manufacturer.TOYOTA, 70);

        System.out.println(Porsche.toString());
        System.out.println(Volkswagen.toString());
        System.out.println(Ferrari.toString());
        System.out.println(Toyota.toString());
    }
}