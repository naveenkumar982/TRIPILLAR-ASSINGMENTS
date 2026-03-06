package com.tripillar_coding_assignments.module5;

import java.lang.Thread;

public class ThreadRunnable implements Runnable {
    String task;
    ThreadRunnable(String task) {
        this.task = task;
    }
    @Override
    public void run() {
        System.out.println(task + "Delivered");
    }

    static void main(String[] args) {
        Thread t1 = new Thread(new ThreadRunnable("Food "));
        Thread t2 = new Thread(new ThreadRunnable("Drink "));
        Thread t3 = new Thread(new ThreadRunnable("Package "));
        t1.start();
        t2.start();
        t3.start();
    }

}
