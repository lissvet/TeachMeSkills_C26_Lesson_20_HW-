package com.teachmeskills.lesson20.task_1.stream;

public class SteamRun implements Runnable {

    private String message;

    public SteamRun(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Do: " + message);
    }

}
