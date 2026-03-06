package com.tripillar_coding_assignments.module5;

public class Thread extends java.lang.Thread {
    static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Thread Started t1: " + t.getState());
        t.start();
    }
}
