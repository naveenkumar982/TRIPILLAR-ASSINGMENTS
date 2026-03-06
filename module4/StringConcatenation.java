package com.tripillar_coding_assignments.module4;
import java.lang.StringBuilder;
public class StringConcatenation {
    static void main(String[] args) {
        StringBuilder s = new StringBuilder("Naveen");
        System.out.println("before builder: " +s.hashCode());
        s.append("Kumar");
        System.out.println("after builder: " +s.hashCode());//here u can see the same hashcode even after the concatenation using string builder
    }
}