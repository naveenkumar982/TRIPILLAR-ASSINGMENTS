package com.tripillar_coding_assignments.module5;

import com.basics.threads.Counter;

import java.lang.Thread;

public class AlternateNumbers {
     static int counter = 1;
    static final int MAX = 10;

    public static void main(String[] args) {
        // Thread 1: Responsible for Odd numbers
        Thread oddThread = new Thread(() -> {
            while (counter <= MAX) {
                while (counter % 2 == 0) { // If it's even, it's not my turn
                    try { Thread.sleep(10); } catch (InterruptedException e) {}
                }
                if (counter <= MAX) {
                    System.out.println("Odd Thread: " + counter++);
                }
            }
        });

        // Thread 2: Responsible for Even numbers
        Thread evenThread = new Thread(() -> {
            while (counter <= MAX) {
                while (counter % 2 != 0) { // If it's odd, it's not my turn
                    try { Thread.sleep(10); } catch (InterruptedException e) {}
                }
                if (counter <= MAX) {
                    System.out.println("Even Thread: " + counter++);
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }

}
