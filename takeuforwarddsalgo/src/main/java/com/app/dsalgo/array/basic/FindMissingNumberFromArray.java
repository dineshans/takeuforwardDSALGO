package com.app.dsalgo.array.basic;

public class FindMissingNumberFromArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //int result = findMissingNumberUsingXOR(arr, arr.length);
        int result = findMissingNumberUsingFormula(arr, arr.length);
        System.out.println("Missing number is " + result);
    }

    /* Using sum formula method*/
    private static int findMissingNumberUsingFormula(int[] a, int n) {
        int totalSum = n * (n+1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += a[i];
        }
        return totalSum - arrSum;
    }

    /* Using XOR method*/
    private static int findMissingNumberUsingXOR(int[] a, int n) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
    }
}
