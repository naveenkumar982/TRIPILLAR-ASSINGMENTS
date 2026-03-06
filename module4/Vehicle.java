package com.tripillar_coding_assignments.module4;

public interface Vehicle {
    void start();
}
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is a four wheeler vehicle.");
    }
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        v1.start();
    }
}
