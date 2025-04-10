package com.app.dsalgo.recursion;

import java.util.Arrays;

public class ReverseArrayUsingRecursion {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        reverseArray(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(e -> System.out.print(" " + e));
    }

    public static void reverseArray(int[] arr, int l, int r) {
        if(l >= r) {
          return;
        }
        reverseArray(arr, l+1, r-1);
        swapArray(arr, l, r);
    }

    public static void swapArray(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
