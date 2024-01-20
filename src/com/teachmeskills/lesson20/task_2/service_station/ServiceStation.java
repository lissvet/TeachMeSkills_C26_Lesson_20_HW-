package com.teachmeskills.lesson20.task_2.service_station;

import static com.teachmeskills.lesson20.task_2.util.Constant.MAX_CAR_SERVICE;

public class ServiceStation {

    public int car = 0;

    public synchronized void getCar() {
        while (car < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.car--;
        System.out.println("The car that passed the service station was taken.");
        System.out.println("Cars at service station: " + this.car);

        notify();
    }

    public synchronized void putCar() {
        while (car >= MAX_CAR_SERVICE) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.car++;
        System.out.println("Brought the car for a service station.");
        System.out.println("Cars at service station: " + this.car);

        notify();
    }

}
