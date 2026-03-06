package com.tripillar_coding_assignments.module4;

public class Immutable {
    static void main(String[] args) {
        String s1 = "Naveen";
        System.out.println("s1: " + s1);
        System.out.println("s1 hashCode: " + s1.hashCode());
        s1 = s1 + " Kumar";
        System.out.println("s1: " + s1);
        System.out.println("s1 hashCode: " + s1.hashCode());// there is a change in hashcode from s1 and s2 this shows strings are immutable
    }
}
