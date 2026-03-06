package com.tripillar_coding_assignments.module4;

public class Garbage {
    public static void main(String[] args) {
        Garbage garbage = new Garbage();
        garbage = null;
        System.gc();
    }
}
