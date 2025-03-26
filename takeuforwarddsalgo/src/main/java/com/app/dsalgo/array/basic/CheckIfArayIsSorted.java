package com.app.dsalgo.array.basic;

public class CheckIfArayIsSorted {

    public static void main(String[] args) {
        //int[] arr = {1,2,2,3,3,4};
        int[] arr = {1,2,3,7,4};
        boolean result = isArraySorted(arr);
        System.out.println("Arrays is sorted : " + result);
    }

    public static boolean isArraySorted(int[] arr) {

        for (int i = 1; i<= arr.length-1; i++) {
            if (arr[i-1] <= arr[i]) {
            } else {
                return false;
            }
        }
        return true;

    }
}
