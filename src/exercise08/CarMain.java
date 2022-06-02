package exercise08;

public class CarMain {
    public static void main(String[] args){
        Car1 aCar = new Car1();
        
        System.out.println("Color: " + aCar.color + " Manufacturer: + " +
               aCar.manufacturer + " maxSpeedKmh: " + aCar.maxSpeedKmh );

        //2d Test
        System.out.println(aCar.toString());


        Car1 Porsche = new Car1(Color.BLACK, Manufacturer.PORSCHE, 400 );
        Car1 Volkswagen = new Car1(Color.SILVER, Manufacturer.VOLKSWAGEN, 120 );
        Car1 Ferrari = new Car1(Color.RED, Manufacturer.FERRARI, 500 );
        Car1 Toyota = new Car1(Color.BLUE, Manufacturer.TOYOTA, 70);

        System.out.println(Porsche.toString());
        System.out.println(Volkswagen.toString());
        System.out.println(Ferrari.toString());
        System.out.println(Toyota.toString());
    }
}