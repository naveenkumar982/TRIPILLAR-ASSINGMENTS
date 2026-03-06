package com.tripillar_coding_assignments.module5;

import java.lang.ArithmeticException;

public class TryCatchFinally {
    public static void main(String[] args) {
        int a,b,c=0;
        a = 20;
        b = 0;
        try {
            c = a / b;
        }catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");;
        }
        finally {
            System.out.println("This block will always execute");
            System.out.println("No matter what happens to the code");
        }
        System.out.println("The value is:" + c);
    }
}
