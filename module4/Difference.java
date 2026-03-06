package com.tripillar_coding_assignments.module4;

public class Difference {
    static void main(String[] args) {
        String n = "Naveen";
        n = n + "Kumar";
        System.out.println("hashcode of string: " + n.hashCode());
        StringBuilder s = new StringBuilder("Naveen");
        System.out.println("before String builder: " + s.hashCode());
        s.append("Kumar");
        System.out.println("after String builder: " + s.hashCode());
        StringBuffer sb = new StringBuffer("Naveen");
        System.out.println("before String Buffer: " + s.hashCode());
        s.append("Kumar");
        System.out.println("after String Buffer: " + s.hashCode());
    }
}
