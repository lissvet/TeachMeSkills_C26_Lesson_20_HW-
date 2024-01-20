package com.teachmeskills.lesson20.task_2.worker;

import com.teachmeskills.lesson20.task_2.service_station.ServiceStation;

public class Worker extends Thread {

    private ServiceStation serviceStation;

    public Worker(ServiceStation serviceStation) {
        this.serviceStation = serviceStation;
    }

    @Override
    public void run() {
        doRepairCar();
    }

    public void doRepairCar() {
        int i = 0;
        for (; i < 5; i++) {
            serviceStation.getCar();
        }
        System.out.println("Service car: " + i);
    }

}
