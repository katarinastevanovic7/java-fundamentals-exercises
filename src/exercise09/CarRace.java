package exercise09;

import exercise08.Car1;

public class CarRace {

    double trackLengthKm;
    Car[] contestantes;
    double[] lapTimes;

    public CarRace(double trackLengthKm, Car[] contestantes) {
        this.trackLengthKm = trackLengthKm;
        this.contestantes = contestantes;
        this.lapTimes = new double[this.contestantes.length];
    }
    public void race() {
        for (int i = contestantes.length-1; i>=0; i--) {
            double speed = (double) contestantes[i].maxSpeedKmh * 0.8;
            double focus = Math.random()+1;
            double lapTime = (this.trackLengthKm/speed)*focus;
            lapTimes[i] = lapTime;
        }
    }
    public Car getLoser() {
        double time = 0; int current = contestantes.length-1;
        for (int i = contestantes.length-1; i >=0; i--) {
            if (time <= lapTimes[i]) {
                current = i;
            }
        }
        return contestantes[current];
    }
    public Car getWinner() {
        double time = 10000000; int current = contestantes.length-1;
        for (int i = contestantes.length-1; i>=0; i--) {
            if (time >=lapTimes[i]) {
                time = lapTimes[i];
                current = i;
            }
        }
        return contestantes[current];
    }
    public void printTimes() {
        System.out.println("Gefahrene Zeiten: ");
        for (int i = contestantes.length - 1; i >= 0; i--) {
            System.out.println(contestantes[i].driverName + " - " + contestantes[i].manufacturer + " - " + (int) lapTimes[i] + "s");

        }

    }
}

