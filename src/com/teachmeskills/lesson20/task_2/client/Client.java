package com.teachmeskills.lesson20.task_2.client;

import com.teachmeskills.lesson20.task_2.service_station.ServiceStation;

public class Client extends Thread {

    private ServiceStation serviceStation;

    public Client(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        bringCar();
    }

    public void bringCar() {
        int i = 0;
        for (; i < 5; i++) {
            serviceStation.putCar();
        }
        System.out.println("Bring car: " + (i));
    }

}
