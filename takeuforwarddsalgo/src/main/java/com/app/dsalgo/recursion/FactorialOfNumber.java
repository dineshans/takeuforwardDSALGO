package com.app.dsalgo.recursion;

public class FactorialOfNumber {

    public static void main(String[] args) {

        System.out.println(factorialOfNumber(3));
    }

    public static int factorialOfNumber(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorialOfNumber(n-1);
    }
}
