package com.tripillar_coding_assignments.module5;

public class ThrowKeyword {
    static void checkAge(int age)  {
        if (age < 18) {
            System.out.println("Invalid age");
        }else {
            throw new RuntimeException("Invalid age");
        }
    }

    static void main(String[] args) {
        checkAge(18);
    }
}
