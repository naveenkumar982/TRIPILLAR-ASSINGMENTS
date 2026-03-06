package com.tripillar_coding_assignments.module4;

public class StaticVariableAndMethod {
    static String collegename = "SNPSU";
    static void rollno(int USN) {
        System.out.println("1SG23" + USN);

    }
    public static void main(String[] args) {
        System.out.println(collegename);
        rollno(70);
    }

}
