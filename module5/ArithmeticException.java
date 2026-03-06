package com.tripillar_coding_assignments.module5;
public class ArithmeticException {
    public static void main(String[] args) {
        int c = 0;
        int a = 5;
        int b = 0;
        try {
             c = a / b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

    }
}
