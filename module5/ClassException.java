package com.tripillar_coding_assignments.module5;

import com.basics.exceptions.InvalidAge;

public class ClassException extends Exception {
    ClassException(String message) {
        super(message);
    }
}
    class Main{
        static void checkAge(int age) throws ClassException {
            if (age < 18){
                throw new ClassException("Age must be 18");
            }
            System.out.println("valid age");
        }
        static void main(String[] args) {
            try {
                checkAge(17);
            }catch (ClassException e){
                System.out.println(e.getMessage());
            }
        }
    }

