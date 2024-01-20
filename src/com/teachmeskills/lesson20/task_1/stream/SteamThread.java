package com.teachmeskills.lesson20.task_1.stream;

public class SteamThread extends Thread {

    private String message;

    public SteamThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Do: " + this.message);
    }

}
