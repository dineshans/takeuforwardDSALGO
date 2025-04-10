package com.app.dsalgo.recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println(fibonacciSeries(4));
    }
    public static int fibonacciSeries(int n) {
        if(n <= 1) {
            return n;
        }
        int last = fibonacciSeries(n-1);
        int secondLast = fibonacciSeries(n-2);
        System.out.println(" last = " + last + " secondLast = " + secondLast);
        return last+secondLast;
    }
}
