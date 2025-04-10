package com.app.dsalgo.cpp;

public class CoconutDistributionElephant {

    public static void main(String[] args) {
        System.out.println(distribute(2));   // false
        System.out.println(distribute(15));  // true
        System.out.println(distribute(10));  // true
        System.out.println(distribute(3));   // false
        System.out.println(distribute(8));   // true
    }

    public static boolean distribute(int N) {
        if (N < 2) {
            return false;  // Cannot distribute 1 or 0 coconuts
        }
        for (int E = 2; E * E <= N; E++) {
            if (N % E == 0) {
                if (N / E > 1) return true; // Valid group found
                if (E > 1 && N / E == 1) return true;
            }
        }
        return false; // No valid distribution found
    }

}
