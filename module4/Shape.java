package com.tripillar_coding_assignments.module4;

abstract class Shape {
    abstract void display();
}
class Circle extends Shape {
    @Override
    void display() {
        System.out.println("Circle is a geometric shape.");
    }

    static void main(String[] args) {
        Circle c = new Circle();
        c.display();
    }
}
