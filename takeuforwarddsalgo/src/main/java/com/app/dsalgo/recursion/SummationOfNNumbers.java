package com.app.dsalgo.recursion;

public class SummationOfNNumbers {

    public static void main(String[] args) {
        int n = 3;
        sumOfNNumbers(n, 0);
        System.out.println(sumOfNNumbers1(3));
    }

    public static void sumOfNNumbers(int i, int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNNumbers(i-1,sum+i);
    }

    // another way - functional recursion
    public static int sumOfNNumbers1(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sumOfNNumbers1(n-1);
    }
}
