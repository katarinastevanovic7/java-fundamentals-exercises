package exercise08;

public class Car1 {


        public Color color;
        public int maxSpeedKmh;
        public Manufacturer manufacturer;

    public Car1() {
            this.color = Color.SILVER;
            this.manufacturer = Manufacturer.VOLKSWAGEN;
            this.maxSpeedKmh = 150;
        }

        public Car1(Color color, Manufacturer manufacturer, int maxSpeedKmh) {
            this.color = color;
            this.manufacturer = manufacturer;
            this.maxSpeedKmh = maxSpeedKmh;
        }

    public Car1(Color red, int i, Manufacturer audi, String max_mustermann) {
    }

    //d)
        public String toString() {
            return "Car{" + "color:" + color + ", maxSpeedKmh: " + maxSpeedKmh + ", manufacturer: " + manufacturer + "}";
        }

        public void repaint(Color color) {
            this.color = color;
        }

        public boolean isFasterThan(Car1 newCar) {
            return this.maxSpeedKmh > newCar.maxSpeedKmh;
        }
    }


