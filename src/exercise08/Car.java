package exercise08;

public class Car {


        public Color color;
        public int maxSpeedKmh;
        public Manufacturer manufacturer;

        public Car() {
            this.color = Color.SILVER;
            this.manufacturer = Manufacturer.VOLKSWAGEN;
            this.maxSpeedKmh = 150;
        }

        public Car(Color color, Manufacturer manufacturer, int maxSpeedKmh) {
            this.color = color;
            this.manufacturer = manufacturer;
            this.maxSpeedKmh = maxSpeedKmh;
        }

        //d)
        public String toString() {
            return "Car{" + "color:" + color + ", maxSpeedKmh: " + maxSpeedKmh + ", manufacturer: " + manufacturer + "}";
        }

        public void repaint(Color color) {
            this.color = color;
        }

        public boolean isFasterThan(exercise08.Car newCar) {
            return this.maxSpeedKmh > newCar.maxSpeedKmh;
        }
    }


