package com.teachmeskills.lesson20.task_1.service;

import com.teachmeskills.lesson20.task_1.stream.SteamRun;
import com.teachmeskills.lesson20.task_1.stream.SteamThread;

public class StreamCreator {

    public static void createStreamThread() {
        SteamThread steamT1 = new SteamThread("Read the news");
        SteamThread steamT2 = new SteamThread("Have breakfast");
        SteamThread steamT3 = new SteamThread("Drink coffee");

        steamT3.setPriority(6);
        steamT2.setPriority(10);
        steamT1.setPriority(1);

        steamT3.start();
        steamT2.start();
        steamT1.start();
    }

    public static void createStreamRunnable() {
        SteamRun steamRun1 = new SteamRun("Read the news");
        SteamRun steamRun2 = new SteamRun("Have breakfast");
        SteamRun steamRun3 = new SteamRun("Drink coffee");


        Thread tread1 = new Thread(steamRun1);
        Thread tread2 = new Thread(steamRun2);
        Thread tread3 = new Thread(steamRun3);

        tread3.start();
        tread1.start();
        tread2.start();
    }

}
