package com.teachmeskills.lesson20.task_1;

import com.teachmeskills.lesson20.task_1.service.StreamCreator;
/**Create a program simulating morning: reading news, breakfast, coffee.
 * Give each thread a name and priority from the config file.
 * Let there be 3 threads.
 * Create and run 3 threads.
 * Make two options: using the Runnable interface and using the Thread class.*/
public class Runner {

    public static void main(String[] args) {
        StreamCreator.createStreamThread();
        StreamCreator.createStreamRunnable();
    }

}
