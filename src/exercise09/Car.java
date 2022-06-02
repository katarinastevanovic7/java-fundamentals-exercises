package exercise09;

import exercise08.Color;
import exercise08.Manufacturer;

public class Car {

    public Color color;
    public int maxSpeedKmh;
    public Manufacturer manufacturer;
    String driverName;
    enum Color {BLUE,GREEN,YELLOW,BLACK,RED,SILVER}
    enum Manufacturer {AUDI,BMW,VOLKSWAGEN,PORSCHE,FERRARI,TOYOTA,HONDA}

    public Car(){
        this.color = Color.SILVER;
        this.manufacturer = Manufacturer.VOLKSWAGEN;
        this.maxSpeedKmh = 150;
    }

    public Car(Color color, Manufacturer manufacturer, int maxSpeedKmh, String driverName){
        this.color=color;
        this.manufacturer=manufacturer;
        this.maxSpeedKmh=maxSpeedKmh;
        this.driverName=driverName;
    }

    public String toString(){
        return "Car{" + "color:" + color + ", maxSpeedKmh: " + maxSpeedKmh + ", manufacturer: " + manufacturer + "}";
    }

    public void repaint(Color color){
        this.color = color;
    }

    public boolean isFasterThan(int maxSpeedKmh){
        if (this.maxSpeedKmh > maxSpeedKmh){
            return true;
        }else{
            return false;
        }

    }
}




