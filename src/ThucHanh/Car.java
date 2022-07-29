package ThucHanh;

import java.util.Random;

import static ThucHanh.MainCar.DISTANCE;
import static ThucHanh.MainCar.STEP;

public class Car implements Runnable {

    private String name;

    public Car(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        while (runDistance < DISTANCE) {
        try {
            int speed = (new Random()).nextInt(10);

            runDistance += speed;

            String log = "|";
            int percentTravel = (runDistance * 100 ) / DISTANCE;
            for (int i = 0; i < DISTANCE; i+= STEP) {
                if (percentTravel >= i && percentTravel < i + STEP) {
                    log += "o";
                }else {
                    log += "-";
                }
            }
            log += "|";
            System.out.println("CAR" + this.name + ": " + log + " " + Math.min(DISTANCE , runDistance) + "Km");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Car" + this.name + "broken ");
            break;
        }
            long endTime = System.currentTimeMillis();
            System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
        }
    }
}
