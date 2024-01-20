package com.teachmeskills.lesson20.task_2;

import com.teachmeskills.lesson20.task_2.client.Client;
import com.teachmeskills.lesson20.task_2.service_station.ServiceStation;
import com.teachmeskills.lesson20.task_2.worker.Worker;
/**There is a service station. A maximum number of cars can be serviced at the service station.
 * Create a class that will run in a separate thread and will add cars to the service station.
 * Create a class that will run in a separate thread and will pick up fixed cars from the service station.
 * Let the maximum number of machines available for maintenance be set in the interface for storing constants.
 * Use synchronized, wait, notify.*/
public class Runner {

    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();

        Worker worker = new Worker(station);
        Client client = new Client(station);

        client.start();
        worker.start();
    }

}
